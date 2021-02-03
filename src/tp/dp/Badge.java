package tp.dp;

import java.util.UUID;

public class Badge {
	private UUID id;
	private String userLogin;
	
	public Badge(String login) {
		this.userLogin=login;
		this.id=UUID.randomUUID(); //random id
	}
	
}
