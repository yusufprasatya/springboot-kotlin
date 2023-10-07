package com.kotlin.sample.Nyobain.Spring.Kotlin.dto

import com.kotlin.sample.Nyobain.Spring.Kotlin.entity.User

data class UserDto(
        val userName: String,
        val email: String
)

fun UserDto.toEntity() = User(
        id = null,
        userName = userName,
        email = email
)

