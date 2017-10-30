package scyberboy.lect01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoPrintWriter {

	public static void main(String[] args) throws IOException {

		try( PrintWriter out = new PrintWriter( new BufferedWriter( new FileWriter("blah.txt") ) ); ) {
			
		}

	}

}
