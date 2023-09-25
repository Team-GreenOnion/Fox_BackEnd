package com.example.fox_backend.infra.mail.controller

import com.example.fox_backend.infra.mail.dto.MailResponse
import com.example.fox_backend.infra.mail.service.CreateEmailCodeService
import com.example.fox_backend.infra.mail.service.ResendCodeRequestService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/email/code")
class EmailController(
    private val createEmailCodeService: CreateEmailCodeService,
    private val resendCodeRequestService: ResendCodeRequestService
) {
    @PostMapping
    fun requestEmailCode(@RequestParam email : String) : MailResponse {
        return createEmailCodeService.sendVerificationCode(email)
    }

    @PostMapping("/resend")
    fun resendEmailCode (@RequestParam email : String) : MailResponse {
        return resendCodeRequestService.ResendCode(email)
    }
}