package org.ismael.services;

import org.ismael.model.User;
import org.ismael.ports.api.ICreateUserApi;
import org.ismael.ports.spi.ICreateUserSpi;

public class CreateUserApi implements ICreateUserApi {

    private final ICreateUserSpi createUserSpi;

    public CreateUserApi(ICreateUserSpi createUserSpi) {
        this.createUserSpi = createUserSpi;
    }

    @Override
    public void createUser(User user) {
        if (user.getEmail() == null || user.getFristName() == null || user.getName() == null) {
            throw new IllegalArgumentException();
        } else {
            createUserSpi.createUser(user);
            System.out.println("User created");
        }
    }
}
