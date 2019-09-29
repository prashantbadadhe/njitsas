package com.njit.sas.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.njit.sas.domain.Complain;


/**
 * Spring Data  repository for the Complain entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ComplainRepository extends JpaRepository<Complain, Long> {

}
