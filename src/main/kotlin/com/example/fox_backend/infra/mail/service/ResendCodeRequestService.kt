package com.example.fox_backend.infra.mail.service

import com.example.fox_backend.infra.mail.dto.MailResponse
import com.example.fox_backend.infra.mail.repository.EmailCodeRepository
import org.springframework.stereotype.Service

@Service
class ResendCodeRequestService(
    private val createEmailCodeService: CreateEmailCodeService,
    private val emailCodeRepository: EmailCodeRepository
) {
    fun ResendCode(email : String) : MailResponse {
        emailCodeRepository.deleteById(email)
        return createEmailCodeService.sendVerificationCode(email)
    }
}