package edu.akslearning.aws.restApiWithEmbeddedDb.repository;

import java.util.List;

import edu.akslearning.aws.restApiWithEmbeddedDb.bean.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long>{
	List<Todo> findByUsername(String username);
}