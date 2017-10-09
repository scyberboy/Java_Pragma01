package scyberboy.lect01;

public class Zoo {
	
	private Animal[] animals;
	
	public Zoo (int capacity) {
		animals = new Animal[capacity];
	}
	public boolean addAnimal(Animal a) {
		for( int i = 0 ; i < animals.length ; i++ ) {
			if( animals[i] == null ) {
				animals[i] = a;
				return true;
			}
		}
		
		return false;
	}

	public void makeLudnica() {
		for( Animal a : animals) {
			if( a != null ) {
				a.makeNoise();
			}
		}
	}
	
	
}
