package com.home

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class EncriptionApplication

fun main(args: Array<String>) {
    runApplication<EncriptionApplication>(*args)
}