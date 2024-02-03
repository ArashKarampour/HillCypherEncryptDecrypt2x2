
import java.awt.BorderLayout;
import java.awt.Color;
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

public class MyPanel implements ActionListener{
    	
    	private JFrame frame;
		private JPanel panel;
		private JTextField pcText;
		private JTextField keyMat;
		private JButton butEnDe;
		private JLabel label;
		private JLabel pcLabel;
		private JLabel keyLabel;
		private String butText;
		private String lblText;
		private String pcLblText;
		private boolean isAlphaZero;
		private boolean isEncryption;
    	
    	public MyPanel(boolean isEncryption,boolean isAlphaZero) {
    	
    		frame = new JFrame();
    		
    		if(isEncryption) {
    			butText = "Encrypt";
    			lblText = "Encrypted Text goes here...";
    			pcLblText = "Plain Text: ";
    		}
    		else {
    			butText = "Decrypt";
    			lblText = "Decrypted Text goes here...";
    			pcLblText = "Cipher Text: ";
    		}
    		
    		this.isAlphaZero = isAlphaZero;
    		this.isEncryption = isEncryption;
    		
    		
    		butEnDe = new JButton(butText);
    		butEnDe.setFont(new Font("verdana", Font.BOLD, 20));    		
    		butEnDe.setBackground(Color.GRAY);
    		butEnDe.setForeground(Color.GREEN);
    		if(!isEncryption)
    			butEnDe.setForeground(Color.RED);
    		
    		pcText = new JTextField();   
    		Font newFontSize = new Font(pcText.getFont().getName(),Font.BOLD,16);
    		pcText.setFont(newFontSize);
    		
    		keyMat = new JTextField();
    		keyMat.setFont(newFontSize);  
    		
    		label = new JLabel(lblText);
    		label.setFont(newFontSize); 
    		label.setForeground(Color.MAGENTA);
    		
    		pcLabel = new JLabel(pcLblText);
    		pcLabel.setFont(new Font("verdana", Font.BOLD, 15));
    		pcLabel.setForeground(Color.BLUE);
    		
    		keyLabel = new JLabel("Key:      ");
    		keyLabel.setFont(new Font("verdana", Font.BOLD, 15));
    		keyLabel.setForeground(Color.BLUE);
    		//JLabel clearLabel = new JLabel("");
    		
    		//plainText.addActionListener(this);
    		//keyMat.addActionListener(this);
    		butEnDe.addActionListener(this);
    		
    		panel = new JPanel();
    		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
    		panel.setLayout(new GridLayout(6, 1, 10, 10));
    		panel.add(pcLabel);
    		panel.add(pcText);
    		panel.add(keyLabel);
    		panel.add(keyMat);    		
    		panel.add(label);
    		panel.add(butEnDe);
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
			if(e.getSource()== butEnDe ) {
				//System.out.println("Encrypt");
				String pcin = pcText.getText();
				String keyin = keyMat.getText();
				if(isEncryption) {
					String ecnrypted = HillCipher.encrypt(pcin, isAlphaZero, keyin,frame);
					System.out.println(ecnrypted);
					label.setText(ecnrypted);
				}
				else {
					String decrypted = HillCipher.decrypt(pcin, isAlphaZero,keyin,frame);
					System.out.println(decrypted);
					label.setText(decrypted);
				}
			}
			
			
			
		}
    }