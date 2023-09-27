package com.example.fox_backend.global.entity

import javax.persistence.*

@MappedSuperclass
abstract class BaseEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?
)