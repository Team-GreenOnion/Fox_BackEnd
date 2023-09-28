package com.example.fox_backend.domain.like.domain.repository

import com.example.fox_backend.domain.like.domain.Like
import com.example.fox_backend.domain.school.domain.School
import com.example.fox_backend.domain.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface LikeRepository : JpaRepository<Like, Long> {
    fun existsByUserAndSchool(user: User, school: School) : Boolean
}