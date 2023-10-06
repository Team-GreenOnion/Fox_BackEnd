package com.example.fox_backend.domain.interest.presentation

import com.example.fox_backend.domain.interest.presentation.dto.request.InterestRequest
import com.example.fox_backend.domain.interest.service.InterestService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/interest")
class InterestController(
    private val interestService: InterestService
) {
    @PostMapping
    fun selectInterest(interestRequest: InterestRequest) =
        interestService.selectInterest(interestRequest)
}