package scyberboy.lect02;

public class ClassDemo04 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "Pesho";
		s1.age = 18;
		
		CoolStudent cs1 = new CoolStudent();
		cs1.name = "Peter";
		cs1.age = 21;
		cs1.haircutStyle = "griva";
		cs1.isMyCarClean = true;
		
		s1.goToSchool();
		cs1.goToSchool();
		
		Student s2 = new CoolStudent();
		//CoolStudent cs2 = new Student();
		
		System.out.println(s2);
		//System.out.println(cs2);
		s2.goToSchool();
		s2 = new Student();
		s2.goToSchool();
		
		
		Student s3 = new CoolStudent();
		s3.name = "Ivan";
		s3.age = 23;
		if( s3 instanceof CoolStudent ) {
			((CoolStudent)s3).isMyCarClean = true;
			((CoolStudent)s3).setCarCleanness(false);
		}
		// NOTE: At compile time it resolves only the fields and methods available by the
		// reference type !!
		// On runtime what would be called/accessed depending on the type of the Object, hence
		// what the reference points to ;)
		
		RichStudent rs1 = new RichStudent();
		rs1.goToSchool();

	}

}
