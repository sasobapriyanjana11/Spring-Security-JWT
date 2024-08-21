package lk.ijse.gdse68.jsonwebtoken.repository;

import lk.ijse.gdse68.jsonwebtoken.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByEmail(String userName);
    boolean existsByEmail(String userName);
    int deleteByEmail(String userName);

}
