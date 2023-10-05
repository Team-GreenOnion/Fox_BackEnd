package com.example.fox_backend.domain.interest.domain.repository

import com.example.fox_backend.domain.interest.domain.Interest
import org.springframework.data.jpa.repository.JpaRepository

interface InterestRepository : JpaRepository<Interest, Long>{
}