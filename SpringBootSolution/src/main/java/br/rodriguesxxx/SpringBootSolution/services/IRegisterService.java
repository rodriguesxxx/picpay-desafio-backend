package br.rodriguesxxx.SpringBootSolution.services;

import org.springframework.data.jpa.repository.JpaRepository;

import br.rodriguesxxx.SpringBootSolution.models.Merchant;
import br.rodriguesxxx.SpringBootSolution.models.User;

public interface IRegisterService {
    
    public User register(User user) throws Exception;

    public Merchant register(Merchant user) throws Exception;

    public <T> T registerEntity(T entity, JpaRepository<T, Long> repository, String errorMessage) throws Exception;

}
