package com.njit.sas.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.njit.sas.domain.Branch;


/**
 * Spring Data  repository for the Branch entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {

}
