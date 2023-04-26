package com.pawga.oauthdemo01

import com.pawga.oauthdemo01.entity.Employee
import com.pawga.oauthdemo01.repository.EmployeeRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OauthDemo01Application(val employeeRepository: EmployeeRepository) : CommandLineRunner {

    @Throws(Exception::class)
    override fun run(vararg args: String) {
        employeeRepository.save(
                Employee(1L, "Lokesh", "123456", "admin@howtodoinjava", "Author", "Java Learner")
        )
        employeeRepository.save(
                Employee(2L, "Alex", "999999", "info@howtodoinjava", "Author", "Another Java Learner")
        )
    }
}

fun main(args: Array<String>) {
    runApplication<OauthDemo01Application>(*args)
}

