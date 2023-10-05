package com.example.fox_backend.domain.user.domain.repository

import com.example.fox_backend.domain.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional
import java.util.UUID

interface UserRepository : JpaRepository<User, Long> {
    fun findByEmail(email : String) : Optional<User>
    fun existsByEmail(email: String) : Boolean
    fun existsByName(name: String) : Boolean
}