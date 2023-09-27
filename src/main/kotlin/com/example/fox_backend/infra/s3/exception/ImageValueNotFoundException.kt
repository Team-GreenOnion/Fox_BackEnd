package com.example.fox_backend.infra.s3.exception

import com.example.fox_backend.global.error.exception.BusinessException
import com.example.fox_backend.global.error.exception.ErrorCode

object ImageValueNotFoundException : BusinessException(
    ErrorCode.IMAGE_VALUE_NOT_FOUND
)