package scyberboy.lect02;

public class USB implements MemoryStorage {

	@Override
	public void save() {
		System.out.println("USB save");
	}

	@Override
	public void delete() {
		System.out.println("USB delete");
	}

}
