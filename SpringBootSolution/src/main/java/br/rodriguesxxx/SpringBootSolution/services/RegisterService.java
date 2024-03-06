package br.rodriguesxxx.SpringBootSolution.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import br.rodriguesxxx.SpringBootSolution.entities.Merchant;
import br.rodriguesxxx.SpringBootSolution.entities.User;
import br.rodriguesxxx.SpringBootSolution.exceptions.RegistrationException;
import br.rodriguesxxx.SpringBootSolution.repository.IMerchantRepository;
import br.rodriguesxxx.SpringBootSolution.repository.IUserRepository;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RegisterService implements IRegisterService {
    
    private IUserRepository userRepository;
    private IMerchantRepository merchantRepository;

    @Autowired
    public RegisterService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public RegisterService(IMerchantRepository merchantRepository) {
        this.merchantRepository = merchantRepository;
    }

    public <T> T registerEntity(T entity, JpaRepository<T, Long> repository, String errorMessage) throws Exception {
        if (entity == null) {
            throw new NullPointerException(errorMessage);
        }
    
        T registeredEntity = repository.save(entity);
    
        if (registeredEntity != null) {
            return registeredEntity;
        }
    
        throw new RegistrationException("Erro interno ao registrar entidade");
    }
    
    public User registerUser(User user) throws Exception {
        return registerEntity(user, userRepository, "O usuário não pode ser null!");
    }
    
    public Merchant registerMerchant(Merchant merchant) throws Exception {
        return registerEntity(merchant, merchantRepository, "O lojista não pode ser null!");
    }
}
