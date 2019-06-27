package pma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pma.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
