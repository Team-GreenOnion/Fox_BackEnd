package com.example.fox_backend.domain.user.domain.repository

import com.example.fox_backend.domain.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface UserRepository : JpaRepository<User, UUID> {
    fun findByEmail(email : String) : User
}