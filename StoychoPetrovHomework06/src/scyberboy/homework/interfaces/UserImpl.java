package scyberboy.homework.interfaces;

import java.time.Instant;
import java.util.Date;

public class UserImpl extends AbstractUser implements IUser {

	public UserImpl(String username) {
		super(username);		
	}

	@Override
	public boolean login() {
		try {
			this.setLastLoginDate(Date.from(Instant.now()));
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		System.out.println("Logged-in: " + getUsername() + " at " + getLastLoginDate());
		return true;
	}

	@Override
	public void printInfo() {
		System.out.println("------- " + getUsername() + " -------");
		System.out.println("Last logged-in: " + getLastLoginDate());
		System.out.println("---------------------");
	}

	@Override
	protected Date getRegisteredDate() {
		return null;
	}
}
