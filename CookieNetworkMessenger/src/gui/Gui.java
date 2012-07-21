package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import network.Client;

public class Gui extends JFrame {
	
	private Client client;
	
	private JPanel panel;
	
	private JTextField input,output;
	
	public Gui(){
		setTitle("CookieNetworkMessenger");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		
		input = new JTextField();
		
		input.setSize(100, 100);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		getContentPane().add(panel);
		panel.add(input);
		
		
		
	}
	
	
	
	public static void main(String[] args){

		 SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                Gui gui = new Gui();
	                gui.setVisible(true);
	            }
	        });
		
		
	}

}
