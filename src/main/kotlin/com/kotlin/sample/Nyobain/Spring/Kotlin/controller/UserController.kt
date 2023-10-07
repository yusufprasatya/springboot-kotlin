package com.kotlin.sample.Nyobain.Spring.Kotlin.controller

import com.kotlin.sample.Nyobain.Spring.Kotlin.dto.UserDto
import com.kotlin.sample.Nyobain.Spring.Kotlin.dto.toEntity
import com.kotlin.sample.Nyobain.Spring.Kotlin.entity.User
import com.kotlin.sample.Nyobain.Spring.Kotlin.service.UserService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getAllUsers(): List<User> = userService.getAllUser()

    @PostMapping
    fun createUser(@RequestBody payload: UserDto):User =
            userService.createUser(payload.toEntity())

    @GetMapping("/{id}")
    fun getUserById(@PathVariable("id") id: Long): User =
            userService.getUserById(id)

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable("id") id: Long): Unit =
            userService.deleteUserById(id)
}