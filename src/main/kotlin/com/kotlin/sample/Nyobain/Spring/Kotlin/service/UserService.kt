package com.kotlin.sample.Nyobain.Spring.Kotlin.service

import com.kotlin.sample.Nyobain.Spring.Kotlin.entity.User
import com.kotlin.sample.Nyobain.Spring.Kotlin.exception.UserNotFoundException
import com.kotlin.sample.Nyobain.Spring.Kotlin.repository.UserRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class UserService(private val userRepository: UserRepository) {

    fun getAllUser(): List<User> = userRepository.findAll()

    fun getUserById(id: Long): User = userRepository.findById(id)
            .orElseThrow{ UserNotFoundException("Not Matching user")}

    fun createUser(user: User): User = userRepository.save(user)

    fun deleteUserById(id: Long) {
        return if(userRepository.existsById(id)) {
                    userRepository.deleteById(id)
                } else throw UserNotFoundException("user not found")
    }

}