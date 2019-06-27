package pma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pma.model.Invitation;

public interface InvitationRepository extends JpaRepository<Invitation, Long>{

}
