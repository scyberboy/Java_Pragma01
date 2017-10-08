package scyberboy.homework.classes;

public class Problems {

	public static void main(String[] args) {

		///
		Person gosho = new Person();
		gosho.firstName = "Gosho";
		gosho.lastName = "Ivanov";
		gosho.age = 41;
		gosho.height = 175;
		gosho.weight = 72;
		gosho.gender = "male";
		
		Person unclePete = new Person();
		unclePete.firstName = "Pepi";
		
		gosho.addRelative(unclePete, "uncle");
		
		Person anonymous1 = new Person();
		anonymous1.firstName = "Homie";
		anonymous1.lastName = "Nr. 1";
		
		gosho.addFriend(anonymous1);
		
		gosho.printPerson();
		
		
		Person anonymous2 = new Person();
		anonymous2.printPerson();
		
		Person tisho = new Person();
		tisho.firstName = "Tihomir";
		tisho.lastName = "Ivanov";
		tisho.age = 37;
		tisho.height = 179;
		tisho.weight = 98;
		tisho.gender = "male";
		
		Person auntyMarry = new Person();
		auntyMarry.firstName = "Marry";
		auntyMarry.lastName = "J. Blige";
		auntyMarry.age = 62;
		auntyMarry.height = 165;
		auntyMarry.gender = "female";
		
		tisho.addRelative(gosho, "step brother");
		tisho.addRelative(auntyMarry, "mother");
		tisho.addFriend(anonymous2);
		tisho.addFriend(anonymous1);
		tisho.addFriend(unclePete);
		
		tisho.printPerson();

		anonymous1.addFriend(anonymous2);
		anonymous1.printPerson();
		
		auntyMarry.addRelative(tisho, "son");
		auntyMarry.printPerson();
	}

}
