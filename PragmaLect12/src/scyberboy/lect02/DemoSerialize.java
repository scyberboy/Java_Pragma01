package scyberboy.lect02;

import java.util.*;
import java.io.*;

public class DemoSerialize {

	public static void main(String[] args) throws IOException, IOException {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(15,"Gosho"));
		students.add(new Student(16,"Pesho"));
		students.add(new Student(14,"Tosho"));
		
		try( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("res/students.ser"))) {
			out.writeObject(students);
		}

		
	}

}
