package com.puvn.simpletargetservice.controller

import com.puvn.simpletargetservice.service.SimpleService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController(
    private val simpleService: SimpleService
) {

    @GetMapping("/")
    fun introduceYourself() =
        ResponseEntity<String>(simpleService.introduce(), HttpStatus.OK)

}