package com.example.fox_backend.domain.interest.service

import com.example.fox_backend.domain.interest.domain.Interest
import com.example.fox_backend.domain.interest.domain.repository.InterestRepository
import com.example.fox_backend.domain.interest.exception.Select1orMoreAnd3orLess
import com.example.fox_backend.domain.interest.presentation.dto.request.InterestRequest
import com.example.fox_backend.domain.user.domain.User
import com.example.fox_backend.domain.user.facade.UserFacade
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class InterestService(
    private val interestRepository: InterestRepository,
    private val userFacade: UserFacade
) {
    @Transactional
    fun selectInterest(interestRequest: InterestRequest) {
        val currentUser: User = userFacade.getCurrentUser()
        val selectedInterests: List<String> = interestRequest.interest

        if (selectedInterests.isEmpty() || selectedInterests.size > 3) {
            throw Select1orMoreAnd3orLess
        }

        selectedInterests.forEach { selectInterest ->
            val interest = Interest(
                user = currentUser,
                interest = selectInterest,
                id = null
            )
            interestRepository.save(interest)
        }
    }
}