package br.rodriguesxxx.SpringBootSolution.services;

import org.springframework.data.jpa.repository.JpaRepository;

import br.rodriguesxxx.SpringBootSolution.entities.Merchant;
import br.rodriguesxxx.SpringBootSolution.entities.User;

public interface IRegisterService {
    
    public User registerUser(User user) throws Exception;

    public Merchant registerMerchant(Merchant user) throws Exception;

    public <T> T registerEntity(T entity, JpaRepository<T, Long> repository, String errorMessage) throws Exception;

}
