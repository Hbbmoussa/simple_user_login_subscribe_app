package users;
import java.rmi.server.UID;
import java.util.Date;

public class WebUser extends User{



	public WebUser(UID id, String firstName, String lastName, String middleName, String email, String password) {
		super(id, firstName, lastName, middleName, email, password);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void login(String eamil, String password) {
		// TODO Auto-generated method stub
		
	}

}
