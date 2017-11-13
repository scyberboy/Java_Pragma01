package scyberboy.exam.model;

public class Animal {
	
	private String color;
	private String breed;
	private String sex;
	private String name;
	
	public Animal() {
		super();
	}

	public Animal(String color, String breed, String sex, String name) {
		super();
		this.color = color;
		this.breed = breed;
		this.sex = sex;
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getNumFields() {
		return 4;
	}
	
}


