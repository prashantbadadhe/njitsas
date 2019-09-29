package com.njit.sas.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.njit.sas.domain.Department;


/**
 * Spring Data  repository for the Department entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
