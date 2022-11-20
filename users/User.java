package users;
import java.rmi.server.UID;
import java.util.Date;

/*
 * Base user class
 * Base implementation for all user-like classes
 */
public abstract class User {
	//MARK: the id of the user
	private UID id;
	
	//MARK: the first name of the user
	private String firstName;
	
	//MARK: the last name of the user
	private String lastName;
	
	//MARK: the middle name of the user
	private String middleName;
	
	//MARK: the email address of the user
	private String email;
	
	//MARK: track the number of times user tries to login
	private int noOFLoginAttempt;
	
	//MARK: indicate the status of the user
	private boolean isBlocked;
	
	//MARK: the date usr was created
	private Date createdDate;
	
	//MARK: date user last logged in
	private Date lastLoginDate;

	private String password;
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UID getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNoOFLoginAttempt() {
		return noOFLoginAttempt;
	}

	public void setNoOFLoginAttempt(int noOFLoginAttempt) {
		this.noOFLoginAttempt = noOFLoginAttempt;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	
	

	public User(UID id, String firstName, String lastName, String middleName, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.email = email;
		this.password = password;
		this.isBlocked = isBlocked;
		this.createdDate = createdDate;
		this.lastLoginDate = lastLoginDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", email=" + email + ", noOFLoginAttempt=" + noOFLoginAttempt + ", isBlocked=" + isBlocked
				+ ", createdDate=" + createdDate + ", lastLoginDate=" + lastLoginDate + "]";
	}
	
	abstract public void login(String eamil, String password);
	abstract public void register();
	
	
	
}
