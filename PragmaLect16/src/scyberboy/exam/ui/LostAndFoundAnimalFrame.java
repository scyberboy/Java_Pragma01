package scyberboy.exam.ui;

import java.awt.event.*;

import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.swing.*;

import scyberboy.exam.*;
import scyberboy.exam.model.*;
import scyberboy.exam.model.ui.*;
import scyberboy.exam.persistance.*;

@SuppressWarnings("serial")
public class LostAndFoundAnimalFrame extends JFrame {
	
	private List<LostAndFoundAnimal> frameEntries;
	private JTable table = new JTable();
	//private Deque<LostAndFoundAnimal> undoQueue = new ArrayDeque<LostAndFoundAnimal>();
	//private Deque<Integer> undoQueueIdx = new ArrayDeque<Integer>();
	private Deque<ArrayList<UndoEntry>> undoQueue = new ArrayDeque<>();
	
	public LostAndFoundAnimalFrame() {
		super("Lost & Found Animal Bulletin Board");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setBounds(50, 50, 1200, 1000);
		
		frameEntries = new ArrayList<> (); 
		createUI();
	}

	private void createUI() {
		
		// pane for the table
		JScrollPane pane = new JScrollPane();
		pane.setBounds(10, 10, 1150, 800);
		add(pane);
		
		// table itself (empty in the beginning)
		//JTable table = new JTable();
		LostAndFoundAnimalTableModel model = new LostAndFoundAnimalTableModel();
		model.setEntries(frameEntries);
		table.setModel(model);
		
		pane.setViewportView(table);
		
		
		//// Buttons (on the bottom) - open, save, delete
		
		// open
		JButton open = new JButton("Open");
		open.setMnemonic(KeyEvent.VK_O);
		
		open.setBounds(20, 880, 100, 30);
		add(open);
		
		open.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				open();
				model.setEntries(frameEntries);
			}			
		});
		
		// save
		JButton save = new JButton("Save");
		save.setMnemonic(KeyEvent.VK_S);
		
		save.setBounds(150, 880, 100, 30);
		add(save);
		
		save.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				save();
			}
		});
		
		// delete
		JButton delete = new JButton("Delete");
		delete.setMnemonic(KeyEvent.VK_D);
		
		delete.setBounds(290, 880, 100, 30);
		add(delete);
		
		delete.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				delete();
				model.setEntries(frameEntries);
			}

		});
		
		// undo
		JButton undo = new JButton("Undo");
		undo.setMnemonic(KeyEvent.VK_U);
		
		undo.setBounds(430, 880, 100, 30);
		add(undo);
		
		undo.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				if( ! undoQueue.isEmpty() ) {
					undo();
					model.setEntries(frameEntries);
				}
			}	
		});
		
	}
	
	private void open() {
		JFileChooser chooser = new JFileChooser();
		int optionReturned = chooser.showOpenDialog(this);
		
		if(optionReturned == JFileChooser.APPROVE_OPTION) {
			File filename = chooser.getSelectedFile();
			
			// set the entries to one loaded from file
			frameEntries = (List<LostAndFoundAnimal>) LostAndFoundAnimalPersistanceManager.open(filename);		
		}
	}
	
	private void save() {
		
		JFileChooser chooser = new JFileChooser();
		int optionReturned = chooser.showSaveDialog(this);
		
		if(optionReturned == JFileChooser.APPROVE_OPTION) {
			File filename = chooser.getSelectedFile();
			
			// set the entries to one loaded from file
			try {
				LostAndFoundAnimalPersistanceManager.save(frameEntries, filename);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "Can't save file (IOException occured): " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}	
	}	
	
	private void delete() {
		int[] rowIndexes = table.getSelectedRows();
		if(rowIndexes.length > 0) {
			ArrayList<UndoEntry> delList = new ArrayList<>();
			for( int i = rowIndexes.length-1 ; i >= 0 ; i-- ) {
				int idx = rowIndexes[i];
				LostAndFoundAnimal entry = frameEntries.remove(idx);
				
				UndoEntry delEntry = new UndoEntry();
				delEntry.elem = entry;
				delEntry.index = idx;
				
				delList.add(delEntry);
				
			}
			undoQueue.push(delList);
		}
	}
	
	private void undo() {
		//frameEntries.add(undoQueue.pop());
		//frameEntries.add(undoQueueIdx.pop(), undoQueue.pop()); //to preserve the initial order... 
		ArrayList<UndoEntry> undoList = undoQueue.pop();
		Collections.reverse(undoList);
		undoList.forEach( entry -> {
			frameEntries.add(entry.index, (LostAndFoundAnimal) entry.elem);
		});
	}
}
