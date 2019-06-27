package pma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pma.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
