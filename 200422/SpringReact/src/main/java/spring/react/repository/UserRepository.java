package spring.react.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import spring.react.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
