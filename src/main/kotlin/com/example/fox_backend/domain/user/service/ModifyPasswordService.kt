package com.example.fox_backend.domain.user.service

import com.example.fox_backend.domain.user.domain.User
import com.example.fox_backend.domain.user.exception.PasswordMissMatchException
import com.example.fox_backend.domain.user.facade.UserFacade
import com.example.fox_backend.domain.user.presentation.dto.request.ModifyPasswordRequest
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ModifyPasswordService (
    private val passwordEncoder: PasswordEncoder,
    private val userFacade: UserFacade
){
    @Transactional
    fun modifyPassword(modifyPasswordRequest: ModifyPasswordRequest) {
        val currentUser : User = userFacade.getCurrentUser()
        if (modifyPasswordRequest.newPassword != modifyPasswordRequest.validPassword || passwordEncoder.matches(modifyPasswordRequest.password, currentUser.password)) {
            throw PasswordMissMatchException
        }
        currentUser.modifyPassword(modifyPasswordRequest.newPassword)
    }
}