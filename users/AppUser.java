package users;

import java.rmi.server.UID;
import java.util.Date;
import java.util.Scanner;

public class AppUser extends User {
	



	public AppUser(UID id, String firstName, String lastName, String middleName, String email, String password) {
		super(id, firstName, lastName, middleName, email, password);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void login(String username,String password ) {
		// TODO Auto-generated method stub
		if(username.equals(this.getFirstName()) && password.equals(this.getLastName())) {
			System.out.println("Login Successful ! ");
		}else {
			for (int i = 1; i>3; i++) {
				if(username.equals(this.getFirstName()) && password.equals(this.getLastName())) {
					System.out.println("Login Successful ! ");
			}
			
		}
	}
		
}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
		
	}


}
