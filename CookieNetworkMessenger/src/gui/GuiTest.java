package gui;
import java.awt.BorderLayout;
import java.io.IOException;
import java.net.UnknownHostException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.SwingUtilities;

import network.Client;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class GuiTest extends javax.swing.JFrame {

	private Client client;
	private JTextArea input;
	private JPanel jPanel1;
	private JButton bExit;
	private JButton bConnect;
	private JButton bSend;
	private JPanel jPanel2;
	private JTextArea output;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GuiTest inst = new GuiTest();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public GuiTest() {
		super();
		initGUI();
		
		client = new Client();
		
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				output = new JTextArea();
				getContentPane().add(output, BorderLayout.NORTH);
				output.setText("Output");
				output.setPreferredSize(new java.awt.Dimension(384, 128));
				output.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
			}
			{
				input = new JTextArea();
				BorderLayout inputLayout = new BorderLayout();
				input.setLayout(inputLayout);
				getContentPane().add(input, BorderLayout.CENTER);
				input.setText("Input");
				input.setPreferredSize(new java.awt.Dimension(384, 71));
				input.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
				input.setWrapStyleWord(true);
				input.setRows(3);
			}
			{
				jPanel1 = new JPanel();
				BorderLayout jPanel1Layout = new BorderLayout();
				getContentPane().add(jPanel1, BorderLayout.SOUTH);
				jPanel1.setLayout(jPanel1Layout);
			}
			{
				jPanel2 = new JPanel();
				BorderLayout jPanel2Layout = new BorderLayout();
				getContentPane().add(jPanel2, BorderLayout.SOUTH);
				jPanel2.setLayout(jPanel2Layout);
				jPanel2.setPreferredSize(new java.awt.Dimension(384, 30));
				{
					bSend = new JButton();
					jPanel2.add(bSend, BorderLayout.WEST);
					bSend.setText("Send");
					bSend.setPreferredSize(new java.awt.Dimension(128, 30));
				}
				{
					bConnect = new JButton();
					jPanel2.add(bConnect, BorderLayout.CENTER);
					bConnect.setText("Connect");
					bConnect.setPreferredSize(new java.awt.Dimension(128, 30));
				}
				{
					bExit = new JButton();
					jPanel2.add(bExit, BorderLayout.EAST);
					bExit.setText("Exit");
					bExit.setPreferredSize(new java.awt.Dimension(128, 30));
				}
			}
			pack();
			this.setSize(400, 274);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
