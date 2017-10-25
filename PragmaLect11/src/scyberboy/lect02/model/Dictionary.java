package scyberboy.lect02.model;

import java.util.*;


public class Dictionary {

	private Map<String,Entry> entries;
	
	public Dictionary() {
		entries = new HashMap<>();
	}
	
	public void add (Entry e) {
		entries.put(e.getWord(), e);
	}
	
	public Entry search (String word) {
		return entries.get(word);
	}
}
