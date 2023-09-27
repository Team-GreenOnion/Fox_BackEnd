package com.example.fox_backend.domain.user.service

import com.example.fox_backend.domain.user.domain.User
import com.example.fox_backend.domain.user.domain.repository.UserRepository
import com.example.fox_backend.domain.user.exception.AccountIdAlreadyExistsException
import com.example.fox_backend.domain.user.exception.EmailAlreadyExistsException
import com.example.fox_backend.domain.user.exception.NameAlreadyExistsException
import com.example.fox_backend.domain.user.exception.PasswordMissMatchException
import com.example.fox_backend.domain.user.presentation.dto.request.UserSignupRequest
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserSignupService (
    private val userRepository: UserRepository,
    private val passwordEncoder: PasswordEncoder
){
    @Transactional
    fun signup (userSignupRequest: UserSignupRequest) {
        if (userRepository.existsByAccountId(userSignupRequest.accountId)) {
            throw AccountIdAlreadyExistsException
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
            accountId = userSignupRequest.accountId,
            password = password,
            name = userSignupRequest.name,
            sex = userSignupRequest.sex,
            id = null
        )
    }
}