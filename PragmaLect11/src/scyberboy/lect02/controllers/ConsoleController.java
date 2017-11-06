package scyberboy.lect02.controllers;

import java.util.Collection;
import java.util.Scanner;

import scyberboy.lect02.model.*;
import scyberboy.lect02.persistance.PersistanceManager;
import scyberboy.lect02.persistance.SavingException;

public class ConsoleController {
	
	private enum MenuChoice {
		ADD,
		SEARCH,
		DELETE,
		LIST,
		EXIT,
		INVALID
	}
	
	private Scanner sc;
	private Dictionary dict;
	
	public void start() {
		
		sc = new Scanner(System.in);
		dict = new Dictionary();
		
		MenuChoice choice = MenuChoice.INVALID;
		
		do {
			choice = showMenu();
			
			switch(choice) {
			case ADD:
				addEntry();
				break;
			case SEARCH:
				search();
				break;
			case DELETE:
				delete();
				break;
			case EXIT:
				break; // exit the loop
			case INVALID:
				System.out.println("Invalid option, try again!");
				break;
			case LIST:
				list();
				break;
			default:
				break;
			}
			
		} while( choice != MenuChoice.EXIT );
		
		System.out.println("Bye!");
	}
	
	private void list() {
		Collection<Entry> entries = dict.getSortedEntries();
		
		System.out.println("The dictionary has words:");
		// Iterirame i printirame :)
		int i = 1;
		for(Entry elem : entries) {
			String line = PersistanceManager.createString(elem);
			System.out.println(i + ". " + line);
			i++;
		}
	}

	private void delete() {
		System.out.print("Enter a word to delete:");
		String word = sc.nextLine();
		try {
			boolean result = dict.delete(word);
			if(result) {
				System.out.println("Word was deleted");
			} else {
				System.out.println("Word not exist");
			}
		} catch (SavingException ex) {
			System.out.println("error while deleting entry");
		}
	}

	private void addEntry() {
		System.out.print("Enter word:");
		String word = sc.nextLine();
		System.out.print("Enter translation:");
		String trans = sc.nextLine();
		System.out.print("Enter transcription:");
		String transcr = sc.nextLine();
		
		Entry e = new Entry(word, trans, transcr);
		try{
			dict.add(e);
			System.out.println("added " + word);
		} catch (SavingException ex) {
			System.out.println("error while adding entry");
		}
		
		
	}
	
	private void search() {
		System.out.print("Enter word to search:");
		String word = sc.nextLine();
		
		Entry e = dict.search(word);
		
		if( e != null ) {
			System.out.println("Translation of " + word + " is: " + e.getTranslation());
		} else {
			System.out.println("Word " + word + " not found :(");
		}
	}
	
	
	
	private MenuChoice showMenu() {
		System.out.println("----- MENU ------");
		System.out.println("1. Add");
		System.out.println("2. Search");
		System.out.println("3. Delete");
		System.out.println("4. List content");
		System.out.println("5. Exit");
		System.out.print("Select option:");
		int c = sc.nextInt();
		sc.nextLine();//parasite
		switch (c) {
		case 1: return MenuChoice.ADD;
		case 2: return MenuChoice.SEARCH;
		case 3: return MenuChoice.DELETE;
		case 4: return MenuChoice.LIST;
		case 5: return MenuChoice.EXIT;
		default:return MenuChoice.INVALID;
		}
	}
	
	

}
