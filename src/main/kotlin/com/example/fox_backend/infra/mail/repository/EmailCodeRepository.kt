package com.example.fox_backend.infra.mail.repository

import com.example.fox_backend.infra.mail.entity.MailCode
import org.springframework.data.repository.CrudRepository

interface EmailCodeRepository : CrudRepository<MailCode, String> {
}