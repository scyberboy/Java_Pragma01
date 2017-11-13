package scyberboy.exam.persistance;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import scyberboy.exam.model.*;



public class LostAndFoundAnimalPersistanceManager {
	
	private static final String SEPARATOR = ",";
	
	public static void save(Collection<LostAndFoundAnimal> entries, File filename) throws IOException {
		
		try( PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename))) ) {
			for(LostAndFoundAnimal entry : entries) {
				String line = createString(entry);
				writer.println(line);
			}
		}
		
	}
	
	public static String createString(LostAndFoundAnimal entry) {
		StringBuilder str = new StringBuilder(); 
		
		str.append(entry.getLostOn());
		str.append(SEPARATOR);
		str.append(entry.getAnimal().getColor());
		str.append(SEPARATOR);
		str.append( entry.getAnimal().getBreed());
		str.append(SEPARATOR);
		str.append(entry.getAnimal().getSex());
		str.append(SEPARATOR);
		str.append(entry.getAnimal().getName());
		str.append(SEPARATOR);
		str.append(entry.getState());
		str.append(SEPARATOR);
		str.append(entry.getTimestamp());
		
		return str.toString();
	}

	public static Collection<LostAndFoundAnimal> open(File filename)  {
		Collection<LostAndFoundAnimal> entries = new ArrayList<>();
		try( Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream(filename))) ) {
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				LostAndFoundAnimal entry = createEntry(line);
				entries.add(entry);
			}
		} catch (FileNotFoundException e) {
			return entries;
		}

		return entries;
	}

	private static LostAndFoundAnimal createEntry(String line) {
		String[] elems = line.split(SEPARATOR);
		Animal a = new Animal(elems[1], elems[2], elems[3], elems[4]);
		return new LostAndFoundAnimal(elems[0], a, elems[5], elems[6]);
	}

}
