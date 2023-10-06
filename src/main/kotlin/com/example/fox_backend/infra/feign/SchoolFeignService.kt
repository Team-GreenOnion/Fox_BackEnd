package com.example.fox_backend.infra.feign

import com.example.fox_backend.domain.school.domain.School
import com.example.fox_backend.domain.school.domain.repository.SchoolRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.lang.Exception

@Service
class SchoolFeignService(
private val schoolInfoClient: SchoolInfoClient,
private val schoolRepository: SchoolRepository
) {

    @Transactional
    fun fetchAndSaveSchoolInfoToDB() {
        println()
        try {
            val schoolInfoResponses = schoolInfoClient.getSchoolInfo() // SchoolInfoResponse 목록을 가져옵니다.

            val schoolInfoEntity = School(
                schulNm = schoolInfoResponses.schulNm,
                atptOfcdcScNm = schoolInfoResponses.atptOfcdcScNm,
                hmpgAdres = schoolInfoResponses.hmpgAdres,
                coeduScNm = schoolInfoResponses.coeduScNm,
                lctnScNm = schoolInfoResponses.lctnScNm,
                hsScNm = schoolInfoResponses.hsScNm,
                orgRdnma = schoolInfoResponses.orgRdnma,
                orgTelno = schoolInfoResponses.orgTelno
            )
            schoolRepository.save(schoolInfoEntity)
        } catch (e: Exception){
            println("")
        }

    }
}