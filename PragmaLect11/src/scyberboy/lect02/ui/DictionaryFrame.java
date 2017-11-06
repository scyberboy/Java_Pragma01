package scyberboy.lect02.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

import scyberboy.lect02.model.Dictionary;
import scyberboy.lect02.model.Entry;
import scyberboy.lect02.model.ui.DictionaryTableModel;

@SuppressWarnings("serial")
public class DictionaryFrame extends JFrame {
	
	private JTextField searchTextField;
	private JTextField wordTextField;
	private JTextField translTextField;
	private JTextField transcrextField;
	
	private Dictionary dict;
	
	public DictionaryFrame() {
		super("Dictionary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		setLayout(null);
		
		dict = new Dictionary();
		createUI();
	}
	
	private void createUI() {
		
		searchTextField = new JTextField();
		searchTextField.setBounds(10, 10, 280, 40);
		add(searchTextField);
		
		JButton searchButton = new JButton("Search");
		searchButton.setBounds(310, 10, 100, 40);
		add(searchButton);
		
		searchButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				search();
				
			}

			
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 100, 400, 350);
		add(scrollPane);
		
		//JTable table = new JTable;
		
		
		DictionaryTableModel tableModel = new DictionaryTableModel();
		List<Entry> tmp = new ArrayList<>();
		for(Entry ent : dict.getSortedEntries()) {
			tmp.add(ent);
		}
		tableModel.setEntries(tmp);
		
		/*JTableHeader header = new JTableHeader();
		header.set;
		table.setTableHeader();*/
		
		//table.setModel(tableModel);
		JTable table = new JTable
		
		scrollPane.setViewportView(table);
		
		// Add buttons
		
		
	}
	
	private void search() {
		
		String searchText = searchTextField.getText();
		Entry entry = dict.search(searchText);
		if(entry != null) {
			JOptionPane.showMessageDialog(this, "Превода е: " + entry.getTranslation(), "Превод", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(this, "Няма такава дума", "Превод", JOptionPane.WARNING_MESSAGE);
		}
	}
	
}
