package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.UserRepository;

@Service
public class UserService {
    /**
     * Autowired field that represents a repository for User entities.
     * This UserRepository interface extends JpaRepository for CRUD operations and allows for operations such as saving, updating, and deleting User entities.
     * It also provides a specific method findByMobile(String mobile) to retrieve a User entity by their mobile number.
     */
    @Autowired
    private UserRepository repository;
}
