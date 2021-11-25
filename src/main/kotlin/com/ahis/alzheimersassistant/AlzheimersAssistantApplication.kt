package com.ahis.alzheimersassistant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class AlzheimersAssistantApplication

fun main(args: Array<String>) {
    runApplication<AlzheimersAssistantApplication>(*args)
}
