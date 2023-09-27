package com.example.fox_backend.domain.user.service

import com.example.fox_backend.domain.user.domain.User
import com.example.fox_backend.domain.user.domain.repository.UserRepository
import com.example.fox_backend.domain.user.exception.*
import com.example.fox_backend.domain.user.presentation.dto.request.UserSignupRequest
import com.example.fox_backend.infra.mail.domain.MailCode
import com.example.fox_backend.infra.mail.domain.repository.EmailCodeRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.Optional

@Service
class UserSignupService (
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder,
    private val mailCodeRepository: EmailCodeRepository
){
    @Transactional
    fun signup (userSignupRequest: UserSignupRequest) {
        val validEmailCode : Optional<MailCode> = mailCodeRepository.findById(userSignupRequest.email)
        val retrievedCode: MailCode = validEmailCode.get()
        
        if (retrievedCode.emailCode != userSignupRequest.validEmailCode) {
            throw EmailCodeMissMatchException
        }

        if (userRepository.existsByEmail(userSignupRequest.email)) {
            throw EmailAlreadyExistsException
        }
        if (userRepository.existsByName(userSignupRequest.name)) {
            throw NameAlreadyExistsException
        }
        if (userSignupRequest.password != userSignupRequest.validPassword) {
            throw PasswordMissMatchException
        }
        val password = passwordEncoder.encode(userSignupRequest.password)
        val user = User(
            email = userSignupRequest.email,
            password = password,
            name = userSignupRequest.name,
            sex = userSignupRequest.sex,
            id = null
        )
        userRepository.save(user)
    }
}