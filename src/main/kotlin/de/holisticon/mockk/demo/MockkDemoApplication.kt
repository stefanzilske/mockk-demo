package de.holisticon.mockk.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MockkDemoApplication

fun main(args: Array<String>) {
    runApplication<MockkDemoApplication>(*args)
}
