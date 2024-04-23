package org.ismael.adapters.adapter_spi.spi_impl;

import org.ismael.adapters.adapter_spi.repositories.UserRepository;
import org.ismael.adapters.mapper.UserMapper;
import org.ismael.model.User;
import org.ismael.ports.spi.IGetAllUsersSpi;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllUsers implements IGetAllUsersSpi {
    private final UserRepository userRepository;

    public GetAllUsers(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll().stream().map(
                UserMapper::mapToDomainUser).toList();
    }
}
