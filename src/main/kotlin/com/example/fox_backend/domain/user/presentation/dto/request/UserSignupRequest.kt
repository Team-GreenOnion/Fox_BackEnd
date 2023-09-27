package com.example.fox_backend.domain.user.presentation.dto.request

import com.example.fox_backend.domain.user.enums.Sex

class UserSignupRequest(
    val email :String,
    val accountId : String?,
    val password : String,
    val validPassword : String,
    val validEmailCode : String,
    val name : String,
    val sex : Sex
)