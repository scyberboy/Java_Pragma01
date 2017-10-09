package scyberboy.lect02;

public class DemoInterfaces {

	public static void main(String[] args) {

		MemoryStorage m1;
		m1 = new CD();
		m1.save();
		
		m1 = new USB();
		m1.save();

		
	}

}
