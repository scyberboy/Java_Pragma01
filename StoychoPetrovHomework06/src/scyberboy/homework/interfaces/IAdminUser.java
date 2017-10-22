package scyberboy.homework.interfaces;

public interface IAdminUser extends IUser {
	public boolean deleteUser(String username);
	public AbstractUser addUser(String username);
}
