package com.sudin.kotlin.springbootkotlinexample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringBootKotlinExampleApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBootKotlinExampleApplication::class.java, *args)
}
