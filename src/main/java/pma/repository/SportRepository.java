package pma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pma.model.Sport;

public interface SportRepository extends JpaRepository<Sport, Long>{

}
