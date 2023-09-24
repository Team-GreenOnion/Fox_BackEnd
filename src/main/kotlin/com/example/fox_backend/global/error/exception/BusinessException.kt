package com.example.fox_backend.global.error.exception

abstract class BusinessException (
    val errorCode : ErrorCode
) : RuntimeException()