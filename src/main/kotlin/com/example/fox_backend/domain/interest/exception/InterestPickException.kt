package com.example.fox_backend.domain.interest.exception

import com.example.fox_backend.global.error.exception.BusinessException
import com.example.fox_backend.global.error.exception.ErrorCode

object InterestPickException : BusinessException (
    ErrorCode.INTEREST_PICK_MISS_MATCH
)