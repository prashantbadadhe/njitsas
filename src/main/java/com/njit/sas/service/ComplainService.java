package com.njit.sas.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.njit.sas.domain.Complain;

import java.util.Optional;

/**
 * Service Interface for managing Complain.
 */
public interface ComplainService {

    /**
     * Save a complain.
     *
     * @param complain the entity to save
     * @return the persisted entity
     */
    Complain save(Complain complain);

    /**
     * Get all the complains.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<Complain> findAll(Pageable pageable);


    /**
     * Get the "id" complain.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Complain> findOne(Long id);

    /**
     * Delete the "id" complain.
     *
     * @param id the id of the entity
     */
    void delete(Long id);
}
