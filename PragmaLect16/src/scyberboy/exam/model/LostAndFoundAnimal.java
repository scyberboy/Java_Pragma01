package scyberboy.exam.model;

public class LostAndFoundAnimal {

	private String lostOn;
	private Animal animal;
	private String state;
	private String timestamp;
	
	public static int getNumFields () {
		return 3 + Animal.getNumFields();
	}
	public LostAndFoundAnimal() {
		super();
	}

	public LostAndFoundAnimal(String lostOn, Animal animal, String state, String timestamp) {
		super();
		this.lostOn = lostOn;
		this.animal = animal;
		this.state = state;
		this.timestamp = timestamp;
	}

	public String getLostOn() {
		return lostOn;
	}

	public void setLostOn(String lostOn) {
		this.lostOn = lostOn;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}	
}
