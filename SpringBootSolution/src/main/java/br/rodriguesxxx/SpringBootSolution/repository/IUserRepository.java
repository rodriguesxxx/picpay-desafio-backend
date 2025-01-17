package br.rodriguesxxx.SpringBootSolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.rodriguesxxx.SpringBootSolution.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{}