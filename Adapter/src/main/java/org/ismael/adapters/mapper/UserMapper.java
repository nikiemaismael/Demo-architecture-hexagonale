package org.ismael.adapters.mapper;

import org.ismael.adapters.adapter_spi.entities.UserEntity;
import org.ismael.model.User;
import org.modelmapper.ModelMapper;

public class UserMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static UserEntity mapToUserEntity(User user) {
        return modelMapper.map(user, UserEntity.class);
    }

    public static User mapToDomainUser(UserEntity userEntity) {
        return modelMapper.map(userEntity, User.class);
    }
}
