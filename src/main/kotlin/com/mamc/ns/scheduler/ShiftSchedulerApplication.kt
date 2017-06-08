package com.mamc.ns.scheduler

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ShiftSchedulerApplication

fun main(args: Array<String>) {
    SpringApplication.run(ShiftSchedulerApplication::class.java, *args)
}
