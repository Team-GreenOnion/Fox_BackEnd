package com.example.fox_backend.domain.school.domain

import com.example.fox_backend.global.entity.BaseEntity
import javax.persistence.Entity

@Entity
class School(
    id :Long,
    val atpt_ofcdc_sc_nm: String,
    val schul_nm: String,
    val lctn_sc_nm: String,
    val org_rdnma: String,
    val org_telno: String,
    val hmpg_adres: String,
    val coedu_sc_nm: String,
    val hs_sc_nm: String
) : BaseEntity(id)
