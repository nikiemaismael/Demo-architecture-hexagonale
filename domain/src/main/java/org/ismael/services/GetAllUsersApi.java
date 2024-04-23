package org.ismael.services;

import org.ismael.model.User;
import org.ismael.ports.api.IGetAllUsersApi;
import org.ismael.ports.spi.ICreateUserSpi;

import java.util.List;

public class GetAllUsersApi implements IGetAllUsersApi {

    private final IGetAllUsersApi getAllUsersApi;

    public GetAllUsersApi( IGetAllUsersApi getAllUsersApi) {
        this.getAllUsersApi = getAllUsersApi;
    }

    @Override
    public List<User> getAllUsers() {
        return getAllUsersApi.getAllUsers();
    }
}
