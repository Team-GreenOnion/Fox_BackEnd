package com.example.fox_backend.domain.user.presentation.dto.request

class ModifyPasswordRequest (
    val password : String,
    val newPassword : String,
    val validPassword : String,
)