package scyberboy.homework.interfaces;

import java.time.Instant;
import java.util.Date;

public abstract class AbstractUser {
	private String username;
	protected Date registeredDate;
	private Date lastLoginDate;
	
	/**
	 * @param username
	 * @param registeredDate
	 * @param lastLoginDate
	 */
	public AbstractUser(String username) {
		this.setUsername(username);;
		this.setRegisteredDate(Date.from(Instant.now()));
	}

	public String getUsername() {
		return username;
	}

	private void setUsername(String username) {
		this.username = username;
	}

	protected Date getRegisteredDate() {
		return registeredDate;
	}
	
	private void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	protected Date getLastLoginDate() {
		return lastLoginDate;
	}

	protected void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	
	public abstract void printInfo(); 
	
	
}
