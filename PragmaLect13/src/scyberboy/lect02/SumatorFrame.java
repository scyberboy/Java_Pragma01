package scyberboy.lect02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SumatorFrame extends JFrame /*implements ActionListener*/ {
	private static final long serialVersionUID = 1069567480321855700L;

	/*private int val1;
	private int val2;
	private int sum;*/
	private JTextField val1;
	private JTextField val2;
	private JLabel result;
	
	SumatorFrame() {
		super("Sumator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100,100,500,300);
		setLayout(null); // ignore the default Layout Manager
		
		createComponents();
		
	}
	
	private void createComponents() {
		JTextField a = new JTextField();
		val1 = a;
		a.setBounds(20, 20, 100, 40);
		add(a);
		
		JTextField b = new JTextField();
		val2 = b;
		b.setBounds(140, 20, 100, 40);
		add(b);
		
		JButton sumButton = new JButton("Sum");
		sumButton.setBounds(300, 20, 100, 40);
		add(sumButton);
		// set listeners
		//sumButton.getModel().addActionListener(this); // as it happens that we implement also the listener - we use this :)
		sumButton.getModel().addActionListener( new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				calculate(e);
			}
		} );
		
		JLabel resultTitle = new JLabel("Result:");
		resultTitle.setBounds(20, 100, 200, 40);
		add(resultTitle);
		
		JLabel resultLabel = new JLabel();
		result = resultLabel;
		resultLabel.setBounds(20, 160, 300, 40);
		add(resultLabel);
	}

/*	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Clicked <- " + e);
	}*/
	
	private void calculate(ActionEvent e) {
		System.out.println("Clicked <- " + e);
		try {
			int i1 = Integer.parseInt(val1.getText());
			int i2 = Integer.parseInt(val2.getText());
			
			int res = i1 + i2;
			
			result.setText( i1 + " + " + i2 + " = " + res);
			
		} catch (NumberFormatException ex) {
			result.setText("Wrong number format");
			System.out.println(ex);
			if( ex.getMessage().equals(val1.getText())) {
				val1.setText(null);
			} else {
				val2.setText(null);
			}
		}
		
	}
}

