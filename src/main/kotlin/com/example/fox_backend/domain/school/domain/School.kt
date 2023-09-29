package com.example.fox_backend.domain.school.domain

import com.example.fox_backend.domain.school.enums.SchoolDistrict
import com.example.fox_backend.global.entity.BaseEntity
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated

@Entity
class School(
    id: Long?,
    val schoolName: String,
    @Enumerated(EnumType.STRING)
    val schoolDistrict: SchoolDistrict,
) : BaseEntity(id)