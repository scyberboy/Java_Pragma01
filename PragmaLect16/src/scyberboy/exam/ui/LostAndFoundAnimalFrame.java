package scyberboy.exam.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import scyberboy.exam.model.*;
import scyberboy.exam.model.ui.*;
import scyberboy.exam.persistance.*;

@SuppressWarnings("serial")
public class LostAndFoundAnimalFrame extends JFrame {
	
	private List<LostAndFoundAnimal> frameEntries;
	private JTable table = new JTable();

	public LostAndFoundAnimalFrame() {
		super("Lost & Found Animal Bulletin Board");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setBounds(100, 100, 1200, 850);
		
		frameEntries = new ArrayList<> (); 
		createUI();
	}

	private void createUI() {
		
		// pane for the table
		JScrollPane pane = new JScrollPane();
		pane.setBounds(10, 10, 1150, 650);
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
		open.setBounds(20, 720, 100, 30);
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
		save.setBounds(150, 720, 100, 30);
		add(save);
		
		save.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				save();
			}
		});
		
		// delete
		JButton delete = new JButton("Delete");
		delete.setBounds(290, 720, 100, 30);
		add(delete);
		
		delete.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {				
				delete();
				model.setEntries(frameEntries);
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
		int rowIndex = table.getSelectedRow();
		if(rowIndex != -1) {
			frameEntries.remove(rowIndex);
		}
	}		
}
