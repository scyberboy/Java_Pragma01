package scyberboy.lect01;

public class Animal {
	
	private int age;
	private String name;
	
	public void setAge(int age) {
		if( age >= 0 ) {
			this.age = age;
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void growUp() {
		setAge(age+1);
	}
	
	public abstract void makeNoise();
	

}
