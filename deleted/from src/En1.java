
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class En1 implements ActionListener{
    	
    	private JFrame frame;
		private JPanel panel;
		private JTextField plainText;
		private JTextField keyMat;
		private JButton butEn0;
		private JLabel label;
		private JLabel pLabel;
		private JLabel keyLabel;
    	
    	public En1() {
    	
    		frame = new JFrame();
    		
    		butEn0 = new JButton("Encrypt");
    		plainText = new JTextField();
    		
    		Font newFontSize = new Font(plainText.getFont().getName(),Font.BOLD,16);
    		plainText.setFont(newFontSize);
    		
    		keyMat = new JTextField();
    		keyMat.setFont(newFontSize);  
    		
    		label = new JLabel("Encrypted Text goes here...");
    		label.setFont(newFontSize);
    		
    		pLabel = new JLabel("Plain Text: ");
    		keyLabel = new JLabel("Key:      ");
    		
    		//plainText.addActionListener(this);
    		//keyMat.addActionListener(this);
    		butEn0.addActionListener(this);
    		
    		panel = new JPanel();
    		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
    		panel.setLayout(new GridLayout(6, 1, 10, 10));
    		panel.add(pLabel);
    		panel.add(plainText);
    		panel.add(keyLabel);
    		panel.add(keyMat);   
    		panel.add(label);
    		panel.add(butEn0);
    		panel.setSize(500, 400);
    		
    		frame.add(panel,BorderLayout.CENTER);
    		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		frame.setTitle("Hill Cipher");
    		frame.pack();
    		frame.setLocationRelativeTo(null);
    		frame.setSize(500, 400);
    		frame.setVisible(true);
    		
    	}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()== butEn0 ) {
				//System.out.println("Encrypt");
				String pin = plainText.getText();
				String keyin = keyMat.getText();
				String ecnrypted = HillCipher.encrypt(pin, false,keyin);
				System.out.println(ecnrypted);
				label.setText(ecnrypted);
			}
			
			
			
		}
    }