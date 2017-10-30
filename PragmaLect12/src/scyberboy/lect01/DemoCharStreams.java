package scyberboy.lect01;

import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.*;
//import java.nio.file.*;

public class DemoCharStreams {

	public static void main(String[] args) throws IOException {
		try (FileReader inStr = new FileReader("res/input.txt");
				FileWriter outStr = new FileWriter("res/out2.txt");) {

			int ch;
			while ((ch = inStr.read()) != -1) {
				outStr.write(ch);
			}

		}
		
		//File inF = new File("res/input.txt");
		Path src;// = Path. ("res/input.txt");
		//src.resolve("res/input.txt");
		
		//Files.copy(new Path("res/input.txt"), new Path("os_copy.txt"), "");
		
	}

}
