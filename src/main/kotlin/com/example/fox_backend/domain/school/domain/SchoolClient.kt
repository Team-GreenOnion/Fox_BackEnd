package com.example.fox_backend.domain.school.domain

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(name = "school-client", url = "https://open.neis.go.kr/hub/")
interface SchoolClient {
    @GetMapping("/schoolInfo")
    fun fetchSchoolData(
        @RequestParam("Type") type: String,
        @RequestParam("plndex") plndex: Int,
        @RequestParam("pSize") pSize: Int,
        @RequestParam("SCHUL_KND_SC_NM") schulKndScNm: String,
        @RequestParam("KEY") key: String
    ): String
}