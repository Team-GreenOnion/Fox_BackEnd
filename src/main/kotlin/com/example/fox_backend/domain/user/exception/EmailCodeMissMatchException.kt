package com.example.fox_backend.domain.user.exception

import com.example.fox_backend.global.error.exception.BusinessException
import com.example.fox_backend.global.error.exception.ErrorCode

object EmailCodeMissMatchException : BusinessException(
    ErrorCode.EMAIL_CODE_MISS_MATCH
)