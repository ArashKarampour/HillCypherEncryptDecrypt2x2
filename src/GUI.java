import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class GUI implements ActionListener{
    	
    	private JFrame frame;
		private JPanel panel;
		private JButton butEn0;
		private JButton butDe0;
		private JButton butEn1;
		private JButton butDe1;
    	private JLabel headerText;
    	private JLabel background;
		
    	public GUI() {
    	
    		frame = new JFrame();
    		
    		butEn0 = new JButton("Encrypt A=0...Z=25");
    		butDe0 = new JButton("Decrypt A=0...Z=25");
    		butEn1 = new JButton("Encrypt A=1...Z=26");
    		butDe1 = new JButton("Decrypt A=1...Z=26");
    		
    		butEn0.setFont(new Font("verdana", Font.BOLD, 15));
    		butDe0.setFont(new Font("verdana", Font.BOLD, 15));
    		butEn1.setFont(new Font("verdana", Font.BOLD, 15));
    		butDe1.setFont(new Font("verdana", Font.BOLD, 15));
    		
    		butEn0.setBackground(Color.CYAN);
    		butDe0.setBackground(Color.CYAN);
    		butEn1.setBackground(Color.GREEN);
    		butDe1.setBackground(Color.GREEN);
    		
    		butEn0.addActionListener(this);
    		butDe0.addActionListener(this);
    		butEn1.addActionListener(this);
    		butDe1.addActionListener(this);
    		
    		
    		headerText = new JLabel("Hill Cipher 2*2");
    		headerText.setFont(new Font("Serif", Font.BOLD, 45));
    		headerText.setForeground(Color.MAGENTA);
    		//headerText.setBounds(100, 50, 100, 50);
    		headerText.setHorizontalAlignment(SwingConstants.CENTER);
    		
    		ImageIcon img = new ImageIcon("background.jpg");
    		//Image icon 
    		background = new JLabel("",img,JLabel.CENTER);
    		background.setBounds(0,0,700,600);
    		
    		panel = new JPanel();
    		panel.setBorder(BorderFactory.createEmptyBorder(50, 100, 100, 100));
    		panel.setLayout(new GridLayout(5, 1, 20, 10));    		
    		panel.add(headerText);
    		panel.add(butEn0);
    		panel.add(butDe0);
    		panel.add(butEn1);
    		panel.add(butDe1);
    		panel.setSize(700,430);
    		panel.setBackground(new Color(0,0,0,0));//for making jpanel transparent
    		
    		
    		frame.add(panel,BorderLayout.CENTER); 
    		frame.add(background);
    		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		frame.setTitle("Hill Cipher 2*2");
    		frame.pack();
    		frame.setResizable(false);
    		frame.setLocationRelativeTo(null);
    		frame.setSize(700,394);
    		frame.setVisible(true);
    		
    	}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()== butEn0 ) {
				//System.out.println("Encrypt");
				//new En0();
				new MyPanel(true, true);
			}
			else if(e.getSource()== butDe0 ) {
				//System.out.println("Decrypt");
				//new De0();
				new MyPanel(false, true);
			}
			else if(e.getSource()== butEn1 ) {
				//System.out.println("Decrypt");
				//new En1();
				new MyPanel(true, false);
			}
			else if(e.getSource()== butDe1 ) {
				//System.out.println("Decrypt");
				//new De1();
				new MyPanel(false, false);
			}
			
			
		}
    }