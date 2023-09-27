package com.example.fox_backend.global.error.exception

enum class ErrorCode (
    val status: Int,
    val message: String
){
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),

    INVALID_TOKEN(401,"Invalid Token"),
    EXPIRED_TOKEN(401, "Expired Token"),

    EMAIL_CODE_OR_EMAIL_MISS_MATCH(400, "EmailCode Or EMAIL Miss Match"),
    EMAIL_NOT_FOUND(404, "Email Not Found"),

    USER_NOT_FOUND(404, "User Not Found"),
    PASSWORD_MISS_MATCH(400, "Password Miss Match"),
    NAME_ALREADY_EXISTS(409, "Nickname Already Exists"),
}