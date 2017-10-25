package scyberboy.lect02.controllers;

import java.util.Scanner;

import scyberboy.lect02.model.*;

public class ConsoleController {
	
	private enum MenuChoice {
		ADD,
		SEARCH,
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
			case EXIT:
				break; // exit the loop
			case INVALID:
				System.out.println("Invalid option, try again!");
				break;
			}
			
		} while( choice != MenuChoice.EXIT );
		
		System.out.println("Bye!");
	}
	
	private void addEntry() {
		System.out.print("Enter word:");
		String word = sc.nextLine();
		System.out.print("Enter translation:");
		String trans = sc.nextLine();
		
		Entry e = new Entry(word, trans);
		dict.add(e);
		
		System.out.println("added " + word);
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
		System.out.println("3. Exit");
		System.out.print("Select option:");
		int c = sc.nextInt();
		sc.nextLine();//parasite
		switch (c) {
		case 1: return MenuChoice.ADD;
		case 2: return MenuChoice.SEARCH;
		case 3: return MenuChoice.EXIT;
		default:return MenuChoice.INVALID;
		}
	}
	
	

}
