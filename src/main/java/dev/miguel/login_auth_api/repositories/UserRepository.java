package dev.miguel.login_auth_api.repositories;

import dev.miguel.login_auth_api.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
     Optional<User> findByEmail(String email);
}
