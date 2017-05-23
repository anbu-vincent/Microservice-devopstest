package com.devopstest.reservation.db.repository;

import com.devopstest.reservation.db.domain.Reservation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by demo
 */
@RepositoryRestResource
public interface ReservationRepository extends PagingAndSortingRepository<Reservation, Long> {

    List<Reservation> findByLastName(@Param("ln") String name);
    List<Reservation> findByFirstName(@Param("fn") String name);
    Reservation findById(@Param("id") Long id);

}

