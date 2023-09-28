package com.example.fox_backend.domain.school.facade

import com.example.fox_backend.domain.school.domain.School
import com.example.fox_backend.domain.school.domain.repository.SchoolRepository
import com.example.fox_backend.domain.school.exception.SchoolNotFundException
import org.springframework.stereotype.Component

@Component
class SchoolFacade (
    private val schoolRepository: SchoolRepository
){
    fun getSchool(schoolId : Long) : School =
        schoolRepository.findById(schoolId).orElseThrow{SchoolNotFundException}
}