package com.pawga.oauthdemo01.service

import com.pawga.oauthdemo01.entity.Employee
import com.pawga.oauthdemo01.repository.EmployeeRepository
import org.springframework.stereotype.Service
import java.util.*

/**
 * Created by sivannikov on 26.04.2023 19:55
 */

@Service
class EmployeeService(private val employeeRepository: EmployeeRepository) {

    fun getAllEmployees(): List<Employee> {
        return employeeRepository.findAll()
    }

    fun getEmployeeById(id: Long): Optional<Employee> {
        return employeeRepository.findById(id)
    }

    fun addEmployee(employee: Employee): Employee {
        return employeeRepository.save(employee)
    }

    fun updateEmployee(id: Long, employee: Employee): Optional<Employee> {
        val existingEmployee: Optional<Employee> = employeeRepository.findById(id)
        if (existingEmployee.isPresent) {
            val existing: Employee = existingEmployee.get()
            val updatedEmployee = Employee(
                    existing.id,
                    existing.name,
                    existing.phone,
                    existing.email,
                    existing.position,
                    existing.bio,
                    )
            employeeRepository.save(updatedEmployee)
        }
        return existingEmployee
    }

    fun deleteEmployee(id: Long) {
        employeeRepository.deleteById(id)
    }
}

