package com.puvn.simpletargetservice.controller

import com.puvn.simpletargetservice.service.SimpleService
import org.springframework.boot.autoconfigure.web.ServerProperties
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/app1/v1")
class SimpleController(
    private val simpleService: SimpleService,
    private val serverProperties: ServerProperties
) {

    @GetMapping("/app1/v1/target-endpoint1")
    fun returnServiceResponse1() =
        ResponseEntity<String>(simpleService.getHelloWorld1() + " ${serverProperties.port}", HttpStatus.OK)

    @GetMapping("/app1/v1/target-endpoint2")
    fun returnServiceResponse2() =
        ResponseEntity<String>(simpleService.getHelloWorld2() + " ${serverProperties.port}", HttpStatus.OK)

    @GetMapping("/app1/v1/internalErrorEndpoint")
    fun returnInternalError() = ResponseEntity<String>("this is error", HttpStatus.INTERNAL_SERVER_ERROR)

    @GetMapping("app1/v1/clientErrorEndpoint")
    fun returnClientError() = ResponseEntity<String>("this is client error", HttpStatus.BAD_REQUEST)

}