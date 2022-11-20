package App;

import java.rmi.server.UID;
import java.util.Date;

import users.AdimUser;
import users.User;
import users.WebUser;


public class RunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UID id = null;
		User adminUser = new AdimUser(id,"Habibou","Moussa","hbb","habibou997@gmail.com","1234");
				
		adminUser.setNoOFLoginAttempt(5);
		adminUser.login("habibou997@gmail.com", "1234");
	}

}
