package scyberboy.lect01;

public class DemoAbstract {

	public static void main(String[] args) {

		//Animal a = new Animal();
		Cat c = new Cat();
		Dog d = new Dog();
		
		Animal a1 = new Cat();
		a1.makeNoise();
		
		a1 = new Dog();
		a1.makeNoise();
		

		Zoo z1 = new Zoo(7);
		z1.addAnimal(c);
		z1.addAnimal(d);
		z1.addAnimal(a1);
		
		Animal a2 = c;
		z1.addAnimal(a2);
		z1.addAnimal(new Dog());
		
		Penguin p1 = new Penguin();
		p1.makeNoise();
		
		z1.addAnimal(p1);
		
		System.out.println("--- Ludnicaaa ---");
		z1.makeLudnica();
		
		
	}

}
