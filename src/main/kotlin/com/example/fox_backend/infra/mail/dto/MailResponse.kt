package com.example.fox_backend.infra.mail.dto

class MailResponse (
    val success : Boolean,
    val message : String,
    val emailCode : String
)