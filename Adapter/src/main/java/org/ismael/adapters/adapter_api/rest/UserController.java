package org.ismael.adapters.adapter_api.rest;


import org.ismael.model.User;
import org.ismael.ports.spi.ICreateUserSpi;
import org.ismael.ports.spi.IGetAllUsersSpi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final ICreateUserSpi createUserSpi;
    private final IGetAllUsersSpi getAllUsersSpi;


    public UserController(ICreateUserSpi createUserSpi, IGetAllUsersSpi getAllUsersSpi) {
        this.createUserSpi = createUserSpi;
        this.getAllUsersSpi = getAllUsersSpi;
    }


    @PostMapping("/create")
    public void createUser(@RequestBody User user) {
        createUserSpi.createUser(user);
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        System.out.println("hello world");
        return ResponseEntity.ok(getAllUsersSpi.getAllUsers());
    }
}
