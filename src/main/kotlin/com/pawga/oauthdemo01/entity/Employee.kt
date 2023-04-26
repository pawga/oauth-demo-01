package com.pawga.oauthdemo01.entity

import jakarta.persistence.*

/**
 * Created by sivannikov on 26.04.2023 19:53
 */


@Entity
class Employee(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,
        val name: String,
        val phone: String,
        val email: String,
        val position: String,

        @Column(length = 1000)
        val bio: String
)