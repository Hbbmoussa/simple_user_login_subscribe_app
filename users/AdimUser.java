package users;

import java.rmi.server.UID;
import java.util.Date;

import Utilities.AppConst;

public class AdimUser extends User{
	


	public AdimUser(UID id, String firstName, String lastName, String middleName, String email, String password) {
		super(id, firstName, lastName, middleName, email, password);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void login(String email, String password) {
		// TODO Auto-generated method stub
		if (this.isBlocked()) {
			System.out.println(AppConst.EXCEEDED_LOGIN_TRIALS);
		}
		if(this.getNoOFLoginAttempt() >= 3) {
			this.setBlocked(true);
			System.out.println(AppConst.EXCEEDED_LOGIN_TRIALS);
			return;
			
		}
		if(this.getEmail().equals(email.trim()) && this.getPassword().equals(password)) {
			this.setNoOFLoginAttempt(0);
			
			this.setLastLoginDate(new Date());
			
			System.out.println(AppConst.LOGGED_IN);
		}else {
			this.setNoOFLoginAttempt(this.getNoOFLoginAttempt() +1);
			System.out.println(AppConst.LOGGED_ERROR);

		}
	}

}
