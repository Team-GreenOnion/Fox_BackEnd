package com.example.fox_backend.infra.s3.exception

import com.example.fox_backend.global.error.exception.BusinessException
import com.example.fox_backend.global.error.exception.ErrorCode

object ImageUploadFailedException : BusinessException(
    ErrorCode.IMAGE_UPLOAD_FAILED
)