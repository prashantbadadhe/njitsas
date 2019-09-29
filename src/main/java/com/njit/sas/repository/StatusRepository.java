package com.njit.sas.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.njit.sas.domain.Status;


/**
 * Spring Data  repository for the Status entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {

}
