package br.com.example.je.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.example.je.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByEmail(String email);

}
