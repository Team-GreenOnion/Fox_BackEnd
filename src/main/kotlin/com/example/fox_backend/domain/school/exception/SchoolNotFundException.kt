package com.example.fox_backend.domain.school.exception

import com.example.fox_backend.global.error.exception.BusinessException
import com.example.fox_backend.global.error.exception.ErrorCode

object SchoolNotFundException : BusinessException(
    ErrorCode.SCHOOL_NOT_FOUND
)