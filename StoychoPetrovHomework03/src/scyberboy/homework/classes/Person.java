package scyberboy.homework.classes;

//import java.lang.reflect.Array;

public class Person {
	
	String firstName = "John";
	String lastName = "Doe";
	int age = 33;
	int height = 181;
	float weight = 79.5f;
	String gender = "unknown";
	
	final int MAX_RELATIVES = 100;
	final int MAX_FRIENDS = 1000;
	Person[] relative = new Person[MAX_RELATIVES];
	String[] relation = new String[MAX_RELATIVES];
	int nrRelatives = 0;
	Person[] friend = new Person[MAX_FRIENDS];
	int nrFriends = 0;
	
	
	
	public Person(String firstName) {
		this.firstName = firstName;
	}
	
	public Person() {
	}

	public void printPerson () {
		System.out.println("Hello, my name is " + firstName + " " + lastName);
		System.out.println("A " + age + " years old of " + gender + " gender");
		System.out.println("I'm " + height + " cm tall and wighting " + weight + " kilos");
		String outlook = (weight + 100) > height ? "Fatty" : "Fitty";
		System.out.println("(quite " + outlook + ") :D");
		
		if( nrRelatives > 0 ) {
			System.out.println("I have a family of " + nrRelatives + ":");
			for( int i = 0 ; i < nrRelatives ; i++ ) {
				System.out.println( "\t" + relation[i] + " " + relative[i].firstName);
			}
		} else {
			System.out.println("I'm a complete orphan ;(");
		}
		
		if( nrFriends > 0 ) {
			String socialStatusStatement = (nrRelatives > 0) ? "I also have " : "But at least have ";
			System.out.println( socialStatusStatement + nrFriends + " friend(s):");
			for( int i = 0 ; i < nrFriends ; i++ ) {
				System.out.println( "\t" + friend[i].firstName + " " + friend[i].lastName);
			}
		} else {
			System.out.println("And have NO friends...(Crying-Out-Loud)");
		}
		
		System.out.println( "That's me !\n" );
	}
	
	public void printBrief () {
		System.out.printf("%s %s, %d y.o. (%s)\n", firstName, lastName, age, gender);
	}
	
	public String getBriefInfo() {
		return String.format("%s %s, %d y.o. (%s)", firstName, lastName, age, gender);
	}
	
	public void addRelative ( Person p, String rel ) {
		
		relative[nrRelatives] = p;
		relation[nrRelatives] = rel;
		nrRelatives++;
	}
	
	public void addFriend ( Person p ) {
		
		friend[nrFriends] = p;
		nrFriends++;
	}
}
