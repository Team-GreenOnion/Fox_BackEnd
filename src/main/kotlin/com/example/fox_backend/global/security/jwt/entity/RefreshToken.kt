package com.example.fox_backend.global.security.jwt.entity

import org.springframework.data.redis.core.RedisHash
import javax.persistence.Id

@RedisHash
class RefreshToken (
    @Id
    val email : String,
    val refreshToken: String,
    val refreshTokenTime : Long
)
