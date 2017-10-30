package scyberboy.lect01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.InputStream;

public class DemoStreams {

	public static void main(String[] args) throws IOException {
		
		try(FileInputStream inStr = new FileInputStream("res/input.txt");
			FileOutputStream outStr = new FileOutputStream("res/out.txt");) {
		
			int b;
			while( (b = inStr.read()) != -1 ) {
				outStr.write(b);
			}
		
			//inStr.
		}
		
	}

}
