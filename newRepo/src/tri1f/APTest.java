package tri1f;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class APTest {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * Launch the application.
	 */
	public static void run() {
		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		frame.setVisible(true);
		// JLabel with image 
		JLabel pic = new JLabel("");        
        java.awt.Image image = new ImageIcon("Untitled drawing-3.png").getImage();
        pic.setIcon(new ImageIcon(image));
        pic.setBounds(300, 100, 10, 10);
        
        // Content Panel to add Label and Image
        //https://docs.oracle.com/javase/tutorial/uiswing/components/rootpane.html
        Container content = frame.getContentPane();
        content.setBackground(new Color(181, 224, 255));
        content.add(pic);
        
        // Menu Objects 
        JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
        
		JMenu mnHone = new JMenu("Home");
		menuBar.add(mnHone);
		
		JMenuItem mntmPreferences = new JMenuItem("Preferences");
		mnHone.add(mntmPreferences);
		
		JMenu mnApTest = new JMenu("AP Test");
		menuBar.add(mnApTest);
		
		JMenuItem mntmApReview = new JMenuItem("Review");
		mntmApReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_UI frame = new AP_UI();
				frame.run();
			}
		});
		mnApTest.add(mntmApReview);
	}	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					APTest apTest = new APTest();
					apTest.run();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
