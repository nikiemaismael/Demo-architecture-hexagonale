package org.ismael.adapters.adapter_spi.spi_impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.ismael.adapters.adapter_spi.entities.UserEntity;
import org.ismael.adapters.adapter_spi.repositories.UserRepository;
import org.ismael.adapters.mapper.UserMapper;
import org.ismael.model.User;
import org.ismael.ports.spi.ICreateUserSpi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CreateUser implements ICreateUserSpi {

    private final UserRepository userRepository;

    public CreateUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) {
        UserEntity userEntity = UserMapper.mapToUserEntity(user);
        userRepository.save(userEntity);
        System.out.println("User created");
    }
}
