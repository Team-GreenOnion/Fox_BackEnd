package com.example.fox_backend.domain.user.exception

import com.example.fox_backend.global.error.exception.BusinessException
import com.example.fox_backend.global.error.exception.ErrorCode

object PasswordMissMatchException : BusinessException (
    ErrorCode.PASSWORD_MISS_MATCH
)