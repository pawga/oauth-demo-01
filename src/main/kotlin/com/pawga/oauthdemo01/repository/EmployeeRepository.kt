package com.pawga.oauthdemo01.repository

import com.pawga.oauthdemo01.entity.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * Created by sivannikov on 26.04.2023 19:53
 */

@Repository
interface EmployeeRepository : JpaRepository<Employee, Long>

