package com.example.fox_backend.domain.user.domain

import com.example.fox_backend.domain.user.enums.Sex
import com.example.fox_backend.global.entity.BaseEntity
import javax.persistence.Entity

@Entity
class User(
     id : Long?,
    val email:String,
    val accountId: String ?= null,
    val password: String,
    val name: String,
    val sex: Sex
) : BaseEntity(id)