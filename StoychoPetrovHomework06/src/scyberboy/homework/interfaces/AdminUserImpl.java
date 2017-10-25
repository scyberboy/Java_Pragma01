package scyberboy.homework.interfaces;

import java.util.Date;

public class AdminUserImpl extends UserImpl implements IAdminUser {

	public AdminUserImpl(String username) {
		super(username);
	}

	@Override
	public boolean deleteUser(String username) {
		System.out.println("Deleted: " + username + "(by " + getUsername() + ")");
		return true;
	}

	@Override
	public AbstractUser addUser(String username) {
		AbstractUser au = new UserImpl(username);
		System.out.println("Added: " + username + "(by " + getUsername() + ")");
		return au;
	}

	@Override
	public void printInfo() {
		System.out.println("------- " + getUsername() + " -------");
		System.out.println("Registered: " + getRegisteredDate());
		System.out.println("Last logged-in: " + getLastLoginDate());		
		System.out.println("---------------------");
	}
	
	
	protected Date getRegisteredDate() {
		return registeredDate;
	}
}
