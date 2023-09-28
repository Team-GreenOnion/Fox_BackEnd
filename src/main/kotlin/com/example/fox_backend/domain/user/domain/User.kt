package com.example.fox_backend.domain.user.domain

import com.example.fox_backend.domain.user.enums.Sex
import com.example.fox_backend.global.entity.BaseEntity
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Entity
class User(
    id : Long?,
    val email:String,
    var password: String,
    val name: String,
    var profileUrl: String? = null,
    @Enumerated(EnumType.STRING)
    val sex: Sex
) : BaseEntity(id) {
    fun modifyPassword(password: String) {
        this.password = password
    }
    fun uploadProfile(profileUrl: String) {
        this.profileUrl = profileUrl
    }
}