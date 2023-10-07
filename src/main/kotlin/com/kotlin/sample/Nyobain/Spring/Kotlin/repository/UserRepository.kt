package com.kotlin.sample.Nyobain.Spring.Kotlin.repository

import com.kotlin.sample.Nyobain.Spring.Kotlin.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long>
