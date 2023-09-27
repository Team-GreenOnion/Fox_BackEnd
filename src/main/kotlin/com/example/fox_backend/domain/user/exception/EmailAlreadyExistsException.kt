package com.example.fox_backend.domain.user.exception

import com.example.fox_backend.global.error.exception.BusinessException
import com.example.fox_backend.global.error.exception.ErrorCode

object EmailAlreadyExistsException : BusinessException (
    ErrorCode.EMAIL_ALREADY_EXISTS
)