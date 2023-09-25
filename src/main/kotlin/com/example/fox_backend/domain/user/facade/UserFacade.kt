package com.example.fox_backend.domain.user.facade

import com.example.fox_backend.domain.user.domain.User
import com.example.fox_backend.domain.user.domain.repository.UserRepository
import com.example.fox_backend.domain.user.exception.UserNotFoundException
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class UserFacade(
    private val userRepository: UserRepository
) {
    fun getCurrentUser(): User {
        val email = SecurityContextHolder.getContext().authentication.name
        return userRepository.findById(UUID.fromString(email)).orElseThrow { UserNotFoundException }
    }

    fun getUserByEmail(email: String): User {
       return userRepository.findByEmail(email) ?: throw UserNotFoundException
    }
}