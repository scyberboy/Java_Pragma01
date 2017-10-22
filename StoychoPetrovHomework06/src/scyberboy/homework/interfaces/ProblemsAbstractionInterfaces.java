package scyberboy.homework.interfaces;

import java.util.concurrent.TimeUnit;

public class ProblemsAbstractionInterfaces {

	public static void main(String[] args) throws InterruptedException {

		UserImpl u1 = new UserImpl("user1");
		u1.printInfo();
		TimeUnit.SECONDS.sleep(1);		
		u1.login();
		u1.printInfo();
		
		AdminUserImpl a1 = new AdminUserImpl("admin1");
		a1.printInfo();
		TimeUnit.SECONDS.sleep(1);
		a1.login();
		a1.printInfo();
		
		AbstractUser au2 = a1.addUser("user3");
		au2.printInfo();
		
		a1.deleteUser("blah");
		
		TimeUnit.SECONDS.sleep(1);
		AbstractUser au = new UserImpl("abstract_ref_1");
		au.printInfo();
		
		TimeUnit.SECONDS.sleep(1);
		AbstractUser aa = new AdminUserImpl("abstract_ref_2");		
		aa.printInfo();
		
		
		//System.out.println(((AdminUserImpl) au).getRegisteredDate()); //<--- Exception due to down-cast :)
		System.out.println(((AdminUserImpl) aa).getRegisteredDate());
		
		// referenciq ot bazoviq, metoda se izpylnqva spored obekta (Admin - pokazva registered Date) ;)
		TimeUnit.SECONDS.sleep(1);
		UserImpl u2 = new AdminUserImpl("admin2");
		u2.printInfo();
		
	}

}
