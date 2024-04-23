package org.ismael.adapters.adapter_spi.repositories;

import org.ismael.adapters.adapter_spi.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
