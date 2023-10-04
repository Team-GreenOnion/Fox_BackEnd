package com.example.fox_backend.domain.school.domain

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "schoolApi", url = "https://open.neis.go.kr/hub/schoolInfo")
interface SchoolInfoClient {
    @GetMapping(
        "?Type=json&plndex=1&pSize=100&SCHUL_KND_SC_NM=고등학교&KEY=c286db4930774debacc664b905a7524a",
        produces = ["application/json"]
    )
    fun getSchoolInfo(): SchoolInfoResponse
}
