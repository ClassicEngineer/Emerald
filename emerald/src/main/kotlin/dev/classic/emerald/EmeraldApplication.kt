package dev.classic.emerald

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EmeraldApplication

fun main(args: Array<String>) {
	runApplication<EmeraldApplication>(*args)
}
