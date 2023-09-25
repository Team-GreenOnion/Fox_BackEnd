package com.example.fox_backend.global.security.principle

import com.example.fox_backend.domain.user.domain.User
import com.example.fox_backend.domain.user.facade.UserFacade
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService

class AuthDetailsService(
    private val userFacade: UserFacade
) : UserDetailsService {
    override fun loadUserByUsername(email: String?): UserDetails {
        val user: User? = email?.let { userFacade.getUserByEmail(it) }
        return AuthDetails(user!!.email)

    }
}