package com.example.fox_backend.domain.like.domain

import com.example.fox_backend.domain.school.domain.School
import com.example.fox_backend.domain.user.domain.User
import com.example.fox_backend.global.entity.BaseEntity
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class Like (
    id : Long?,
    @ManyToOne @JoinColumn(name = "user_id")
    val user : User,
    @ManyToOne @JoinColumn(name = "school_id")
    val school: School
) : BaseEntity(id)