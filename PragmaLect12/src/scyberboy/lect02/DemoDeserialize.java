package scyberboy.lect02;

import java.util.*;
import java.io.*;

public class DemoDeserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		try( ObjectInputStream input = new ObjectInputStream(new FileInputStream("res/students.ser"))) {
			
			@SuppressWarnings("unchecked")
			List<Student> blah = (List<Student>) input.readObject();
			for(Student s : blah) {
				System.out.println(s.getName() + " : " + s.getAge());
			}
		}

	}

}
