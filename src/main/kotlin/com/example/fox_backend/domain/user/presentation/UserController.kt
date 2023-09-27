package com.example.fox_backend.domain.user.presentation

import com.example.fox_backend.domain.user.presentation.dto.request.UserSignupRequest
import com.example.fox_backend.domain.user.service.UserSignupService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
    private val userSignupService: UserSignupService
) {
    @PostMapping("/signup")
    fun signup(userSignupRequest: UserSignupRequest) =
        userSignupService.signup(userSignupRequest)
}