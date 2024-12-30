package actions.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import actions.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
