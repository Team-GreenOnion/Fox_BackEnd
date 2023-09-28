package com.example.fox_backend.domain.like.facade

import com.example.fox_backend.domain.like.domain.repository.LikeRepository
import com.example.fox_backend.domain.school.domain.School
import com.example.fox_backend.domain.user.domain.User

class LikeFacade(
    private val likeRepository: LikeRepository
) {
    fun hasUserGivenLikeToSchool(user: User, school: School) : Boolean {
        return likeRepository.existsByUserAndSchool(user, school)
    }
}