package com.puvn.simpletargetservice.service

import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicInteger

@Service
class SimpleService {

    private val atomicCounter1 = AtomicInteger()
    private val atomicCounter2 = AtomicInteger()

    fun getHelloWorld1() = "hello world, i am endpoint one #${atomicCounter1.incrementAndGet()}"

    fun getHelloWorld2() = "hello world, i am endpoint two #${atomicCounter2.incrementAndGet()}"
    fun introduce() = "hello, i am simple target service"

}