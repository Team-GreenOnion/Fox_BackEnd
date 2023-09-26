package com.example.fox_backend.global.security.jwt.repository

import com.nimbusds.oauth2.sdk.token.RefreshToken
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface RefreshTokenRepository: JpaRepository<RefreshToken, Long> {
    fun existsByEmail(email : String) : Boolean
    fun findByEmail(email : String) : Optional<RefreshToken>
    fun save(refreshToken: String)
}