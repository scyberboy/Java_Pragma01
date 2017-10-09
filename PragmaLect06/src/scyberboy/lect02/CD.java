package scyberboy.lect02;

public class CD implements MemoryStorage {

	@Override
	public void save() {
		System.out.println("CD save");
	}

	@Override
	public void delete() {
		System.out.println("CD delete");
	}

}
