package scyberboy.lect02.model;

import java.util.*;

import scyberboy.lect02.persistance.*;

public class Dictionary {

	private Map<String,Entry> entries;
	
	public Dictionary() {
		load();
	}
	
	private void load() {
		entries = new HashMap<>();
		Collection<Entry> loadedEntries = PersistanceManager.load();
		for(Entry entry : loadedEntries) {
			entries.put(entry.getWord(), entry);
		}
	}

	public void add (Entry e) throws SavingException {
		entries.put(e.getWord(), e);
		save();
	}
	
	public Entry search (String word) {
		return entries.get(word);
	}
	
	public boolean delete(String word) throws SavingException {
		Entry entry = entries.remove(word);
		save();
		
		return (entry != null);
	}

	private void save() throws SavingException {
		PersistanceManager.save(entries.values());
	}

	public Collection<Entry> getSortedEntries() {
		//Collection<Entry> sortedEntries = entries.values();
		TreeMap<String, Entry> sortedDict = new TreeMap<>(entries);
		return sortedDict.values();
	}
}
