package org.ismael.adapters;

import org.ismael.adapters.adapter_spi.repositories.UserRepository;
import org.ismael.adapters.mapper.UserMapper;
import org.ismael.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdapterApplicationTests {
    @Autowired
    UserRepository userRepository ;

    @Test
    void contextLoads() {
    }

    @Test
    void createUser() {
        User user = new User();
        user.setFristName("Ismael");
        user.setName("Nikiema");
        user.setEmail("nikiema@ismael");
        userRepository.save(UserMapper.mapToUserEntity(user));
    }

}
