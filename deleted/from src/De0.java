
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

public class De0 implements ActionListener{
    	
    	private JFrame frame;
		private JPanel panel;
		private JTextField cipherText;
		private JTextField keyMat;
		private JButton butDe0;
		private JLabel label;
		private JLabel cLabel;
		private JLabel keyLabel;
		
    	public De0() {
    	
    		frame = new JFrame();
    		
    		butDe0 = new JButton("Decrypt");
    		cipherText = new JTextField();
    		Font newFontSize = new Font(cipherText.getFont().getName(),Font.BOLD,16);
    		cipherText.setFont(newFontSize);
    		
    		keyMat = new JTextField();
    		keyMat.setFont(newFontSize);
    		
    		label = new JLabel("Decrypted Text goes here...");
    		label.setFont(newFontSize);  
    		
    		cLabel = new JLabel("Cipher Text: ");
    		keyLabel = new JLabel("Key:      ");
    		//plainText.addActionListener(this);
    		//keyMat.addActionListener(this);
    		butDe0.addActionListener(this);
    		
    		panel = new JPanel();
    		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
    		panel.setLayout(new GridLayout(6, 1, 10, 10));
    		panel.add(cLabel);
    		panel.add(cipherText);
    		panel.add(keyLabel);
    		panel.add(keyMat); 
    		panel.add(label);
    		panel.add(butDe0);
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
			if(e.getSource()== butDe0){
				//System.out.println("Encrypt");
				String pin = cipherText.getText();
				String keyin = keyMat.getText();
				String ecnrypted = HillCipher.decrypt(pin, true,keyin);
				System.out.println(ecnrypted);
				label.setText(ecnrypted);
			}
			
			
			
		}
    }