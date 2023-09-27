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
    EMAIL_ALREADY_EXISTS(409, "Email Already Exists"),

    PASSWORD_MISS_MATCH(400, "Password Miss Match"),
    USER_NOT_FOUND(404, "User Not Found"),
    NAME_ALREADY_EXISTS(409, "Name Already Exists"),
    ACCOUNTID_ALREADY_EXISTS(409, "AccountId Already Exists"),
}