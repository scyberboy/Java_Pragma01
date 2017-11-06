package scyberboy.lect02.model.ui;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import scyberboy.lect02.model.Entry;

@SuppressWarnings("serial")
public class DictionaryTableModel extends AbstractTableModel {

	private static List<Entry> entries;
	
	@Override
	public int getRowCount() {		
		return (entries != null ? entries.size() : 0);
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		int size = getRowCount();
		if(size > rowIndex) {
			Entry entry = entries.get(rowIndex);
			switch(columnIndex) {
			case 0:
				return entry.getWord();
			case 1:
				return entry.getTranslation();
			case 2:
				return entry.getTranscription();
			}
		}
		return null;
	}

	public static List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		DictionaryTableModel.entries = entries;
		
		fireTableDataChanged();
	}
	
	@Override
	public String getColumnName(int column) {
		switch(column) {
		case 0: return "Word";
		case 1: return "Translation";
		case 2: return "Transcription";
		}
		return null;
	}

}
