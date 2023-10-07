package com.kotlin.sample.Nyobain.Spring.Kotlin.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/home")
class HomeController
{
    @GetMapping("/")
    fun home(model: Model): String {
        model["title"] = "Blog"
        return "blog"
    }
}