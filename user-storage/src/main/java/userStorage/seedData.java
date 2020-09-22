package userStorage;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class seedData implements CommandLineRunner {
	
	private UserRepository userRepository;
	
	public seedData(UserRepository userRepository) {
	
		this.userRepository = userRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		User George = new User(
				
				"George",
				"Wood",
				"George.Wood@gmail.com"
		);
		
		User Tracy = new User(
				
				"Tracy",
				"Beacker",
				"tracy-beaker@hotmail.co.uk"
		);
		
		User Harriet = new User(
				
				"Harriet",
				"Duff",
				"H.Duffy@yahoo.com"
		);
		
		/*
		 * Data will be removed from database
		 * everytime the program is run in 
		 * order to not overfill it
		 */
		this.userRepository.deleteAll();
		
		// add out hotels to database
		List<User> users = Arrays.asList(George, Tracy, Harriet);
		this.userRepository.saveAll(users);
		
		
	}

}
 