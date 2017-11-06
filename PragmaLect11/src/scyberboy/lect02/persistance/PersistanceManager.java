package scyberboy.lect02.persistance;

import java.util.*;
import scyberboy.lect02.model.Entry;
import java.io.*;

public class PersistanceManager {
	
	private static final String SEPARATOR = " = ";
	private static final String FILE_NAME = "dict.txt";
	
	public static void save(Collection<Entry> entries) throws SavingException {
		
		try( PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(FILE_NAME))) ) {
			for(Entry entry : entries) {
				String line = createString(entry);
				writer.println(line);
			}
		} catch (IOException e) {
			throw new SavingException();
		}
		
	}
	
	public static String createString(Entry entry) {
		StringBuilder str = new StringBuilder(); 
		str.append(entry.getWord());
		str.append(SEPARATOR);
		str.append(entry.getTranslation());
		str.append(SEPARATOR);
		str.append(entry.getTranscription());
		
		return str.toString();
	}

	public static Collection<Entry> load() /*throws LoadingException*/ {
		Collection<Entry> entries = new ArrayList<>();
		try( Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream(FILE_NAME))) ) {
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				Entry entry = createEntry(line);
				entries.add(entry);
			}
		} catch (FileNotFoundException e) {
			return entries;
			//throw new LoadingException();
		}

		return entries;
	}

	private static Entry createEntry(String line) {
		String[] elems = line.split(SEPARATOR);
		return new Entry(elems[0], elems[1], elems[2]);
	}
}
