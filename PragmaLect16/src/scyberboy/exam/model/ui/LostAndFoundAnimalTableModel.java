package scyberboy.exam.model.ui;

import java.util.List;
import javax.swing.table.AbstractTableModel;

import scyberboy.exam.model.LostAndFoundAnimal;



@SuppressWarnings("serial")
public class LostAndFoundAnimalTableModel extends AbstractTableModel {

	private static List<LostAndFoundAnimal> entries;
	
	@Override
	public int getRowCount() {
		return (entries != null ? entries.size() : 0);
	}

	@Override
	public int getColumnCount() {
		return LostAndFoundAnimal.getNumFields();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		int size = getRowCount();
		if(size > rowIndex) {
			LostAndFoundAnimal entry = entries.get(rowIndex);
			switch(columnIndex) {
			case 0:
				return entry.getLostOn();
			case 1:
				return entry.getAnimal().getColor();
			case 2:
				return entry.getAnimal().getBreed();
			case 3:
				return entry.getAnimal().getSex();
			case 4:
				return entry.getAnimal().getName();
			case 5:
				return entry.getState();
			case 6:
				return entry.getTimestamp();
			}
		}
		
		return null;
	}
	
	// getEntries
	public List<LostAndFoundAnimal> getEntries() {
		return entries;
	}

	// setEntries
	public void setEntries(List<LostAndFoundAnimal> ent) {
		entries = ent;
		fireTableDataChanged();
	}
	
	@Override
	public String getColumnName(int column) {
		switch(column) {
		case 0: return "Lost On";
		case 1: return "Color";
		case 2: return "Breed";
		case 3: return "Gender";
		case 4: return "Status";
		case 5: return "Name";
		case 6: return "Entered On";
		}
		return null;
	}

}
