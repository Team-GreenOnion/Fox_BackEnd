package com.example.fox_backend.infra.mail.entity

import lombok.Builder
import lombok.Getter
import org.springframework.data.redis.core.RedisHash
import javax.persistence.Id

@Getter
@RedisHash
@Builder
class MailCode (
    @Id
    val email : String,

    val emailCode : String
)