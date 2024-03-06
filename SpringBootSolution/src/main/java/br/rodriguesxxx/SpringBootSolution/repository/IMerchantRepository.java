package br.rodriguesxxx.SpringBootSolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.rodriguesxxx.SpringBootSolution.entities.Merchant;

@Repository
public interface IMerchantRepository extends JpaRepository<Merchant, Long> {}
