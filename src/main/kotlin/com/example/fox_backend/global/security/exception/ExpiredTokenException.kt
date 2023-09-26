package com.example.fox_backend.global.security.exception

import com.example.fox_backend.global.error.exception.BusinessException
import com.example.fox_backend.global.error.exception.ErrorCode

object ExpiredTokenException : BusinessException (
    ErrorCode.EXPIRED_TOKEN
)