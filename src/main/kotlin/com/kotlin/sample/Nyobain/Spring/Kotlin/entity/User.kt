package com.kotlin.sample.Nyobain.Spring.Kotlin.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.AllArgsConstructor

@Entity
@Table(name = "users")
data class User (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long?,
        val userName: String?,
        val email: String?,
) {
}