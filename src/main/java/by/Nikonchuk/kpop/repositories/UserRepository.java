package by.Nikonchuk.kpop.repositories;

import by.Nikonchuk.kpop.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
