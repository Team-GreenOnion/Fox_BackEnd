package com.example.fox_backend.domain.user.exception

import com.example.fox_backend.global.error.exception.BusinessException
import com.example.fox_backend.global.error.exception.ErrorCode

object NameAlreadyExistsException : BusinessException (
    ErrorCode.NAME_ALREADY_EXISTS
)