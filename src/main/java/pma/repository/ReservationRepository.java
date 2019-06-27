package pma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pma.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
