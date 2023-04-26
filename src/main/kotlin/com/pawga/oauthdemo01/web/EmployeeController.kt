package com.pawga.oauthdemo01.web

import com.pawga.oauthdemo01.entity.Employee
import com.pawga.oauthdemo01.service.EmployeeService
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * Created by sivannikov on 26.04.2023 20:34
 */

@RestController
@RequestMapping("/api/employees")
@CrossOrigin
class EmployeeController(private val employeeService: EmployeeService) {

    @GetMapping
    fun getAllEmployees(): List<Employee> {
        return employeeService.getAllEmployees()
    }
//
//    @GetMapping("/{id}")
//    fun getEmployeeById(@PathVariable id: Long): ResponseEntity<Employee> {
//        val employee = employeeService.getEmployeeById(id)
//        return employee.map<Employee>(ResponseEntity::ok).orElseGet { ResponseEntity.notFound().build<Any>() }
//    }
//
//    @PostMapping
//    fun addEmployee(@RequestBody employee: Employee): ResponseEntity<Employee> {
//        val savedEmployee: Employee = employeeService.addEmployee(employee)
//        return ResponseEntity.created(URI.create("/api/employees/" + savedEmployee.getId())).body<Employee>(savedEmployee)
//    }
//
//    @PutMapping("/{id}")
//    fun updateEmployee(@PathVariable id: Long,
//                       @RequestBody employee: Employee): ResponseEntity<Employee> {
//        val existingEmployee: Optional<Employee> = employeeService.updateEmployee(id,
//                employee)
//        return existingEmployee.map<Any>(ResponseEntity::ok).orElseGet { ResponseEntity.notFound().build<Any>() }
//    }
//
//    @DeleteMapping("/{id}")
//    fun deleteEmployee(@PathVariable id: Long): ResponseEntity<Void> {
//        employeeService.deleteEmployee(id)
//        return ResponseEntity.noContent().build()
//    }
}
