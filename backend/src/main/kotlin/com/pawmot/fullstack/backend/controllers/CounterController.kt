package com.pawmot.fullstack.backend.controllers

import com.pawmot.fullstack.backend.dto.DataDto
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod.GET
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicInteger

@RestController
class CounterController {
    private val counter = AtomicInteger(0)

    @RequestMapping("api/v1/count", method = arrayOf(GET))
    fun incrementAndGet() =
        @Suppress("UsePropertyAccessSyntax")
        DataDto(counter.incrementAndGet())

    @RequestMapping("api/v1/hello", method = arrayOf(GET))
    fun hello() = DataDto("hello!")
}