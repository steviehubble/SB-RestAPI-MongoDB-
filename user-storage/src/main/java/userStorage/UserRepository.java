package userStorage;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	User findByid(String id);
	List<User> findByLastName(String lastName);
	

}
