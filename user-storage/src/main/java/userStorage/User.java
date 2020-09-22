package userStorage;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class User {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	
	protected User() {}

	
	public User(String firstName, String lastName, String emailAddress) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	
	

}
