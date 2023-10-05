package com.example.fox_backend.domain.interest.domain

import com.example.fox_backend.domain.user.domain.User
import com.example.fox_backend.global.entity.BaseEntity
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.OneToMany

@Entity
class Interest (
    id: Long?,
    @ManyToOne
    val user: User,

    var interest: String
): BaseEntity(id) {
    fun modifyInterest(interest: String) {
        this.interest = interest
    }
}