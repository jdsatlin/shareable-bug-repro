package com.graphql.kotlin.bug.repro.shareablebugrepro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShareableBugReproApplication

fun main(args: Array<String>) {
    runApplication<ShareableBugReproApplication>(*args)
}
