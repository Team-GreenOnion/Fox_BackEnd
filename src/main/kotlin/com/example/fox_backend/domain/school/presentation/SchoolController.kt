package com.example.fox_backend.domain.school.presentation

import com.example.fox_backend.infra.feign.SchoolFeignService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SchoolController(
    private val schoolFeignService: SchoolFeignService
) {
    @PostMapping("schools")
    fun feign() {
        schoolFeignService.fetchAndSaveSchoolInfoToDB()
    }
}