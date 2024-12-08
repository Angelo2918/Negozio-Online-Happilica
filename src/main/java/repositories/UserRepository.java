package repositories;

import models.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * An interface representing a repository for User entities. Extends JpaRepository for CRUD operations.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByMobile(String mobile);
}
