package com.njit.sas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.njit.sas.domain.Authority;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
