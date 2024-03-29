package com.example.fox_backend.domain.user.presentation

import com.example.fox_backend.domain.user.presentation.dto.request.FindPasswordWthEmailRequest
import com.example.fox_backend.domain.user.presentation.dto.request.ModifyPasswordRequest
import com.example.fox_backend.domain.user.presentation.dto.request.UserLoginRequest
import com.example.fox_backend.domain.user.presentation.dto.request.UserSignupRequest
import com.example.fox_backend.domain.user.service.*
import com.example.fox_backend.global.security.jwt.dto.TokenResponse
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("/user")
class UserController(
    private val userSignupService: UserSignupService,
    private val userLoginService: UserLoginService,
    private val uploadUserProfileService: UploadUserProfileService,
    private val modifyPasswordService: ModifyPasswordService,
    private val findPasswordWithEmailService: FindPasswordWithEmailService
) {
    @PostMapping("/signup")
    fun signup(@RequestBody userSignupRequest: UserSignupRequest) =
        userSignupService.signup(userSignupRequest)

    @PostMapping("/login")
    fun login(@RequestBody userLoginRequest: UserLoginRequest) : TokenResponse =
        userLoginService.login(userLoginRequest)

    @PostMapping("/profile/upload")
    fun uploadProfile(@RequestPart(required = false, value = "profile") profile : MultipartFile) =
        uploadUserProfileService.uploadProfile(profile)

    @PatchMapping("/update/password")
    fun modifyPassword(@RequestBody modifyPasswordRequest: ModifyPasswordRequest) =
        modifyPasswordService.modifyPassword(modifyPasswordRequest)

    @PatchMapping("/new/password")
    fun passwordWithEmail(findPasswordWthEmailRequest: FindPasswordWthEmailRequest) =
        findPasswordWithEmailService.passwordWithEmail(findPasswordWthEmailRequest)
}