package com.example.fox_backend.domain.user.presentation

import com.example.fox_backend.domain.user.presentation.dto.request.ModifyPasswordRequest
import com.example.fox_backend.domain.user.presentation.dto.request.UserSignupRequest
import com.example.fox_backend.domain.user.service.ModifyPasswordService
import com.example.fox_backend.domain.user.service.UserSignupService
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
    private val userSignupService: UserSignupService,
    private val modifyPasswordService: ModifyPasswordService
) {
    @PostMapping("/signup")
    fun signup(@RequestBody userSignupRequest: UserSignupRequest) =
        userSignupService.signup(userSignupRequest)

    @PatchMapping("/update/password")
    fun modifyPassword(@RequestBody modifyPasswordRequest: ModifyPasswordRequest) =
        modifyPasswordService.modifyPassword(modifyPasswordRequest)
}