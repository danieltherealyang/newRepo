package tri1f;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.regex.*;
public class PigLatin {
    JFrame frame;
    public void run() {
        frame = new JFrame("PigLatin");                 
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
        frame.setSize(new Dimension(700,400));
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter String");
        JTextField field = new JTextField(15);
        JTextArea area = new JTextArea();
        area.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        area.setEditable(false);
        
        JButton enter = new JButton("Enter");
        enter.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String English = field.getText();
                PigLatinate pigLatinate = new PigLatinate();
                String PigLatin = pigLatinate.pLSentance(English);
                area.setText(PigLatin);
                field.setEditable(false);
            }
        });
        JButton New = new JButton("New");
        New.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                area.setText("");
                field.setEditable(true);
                field.setText("");
            }
        });
        
        panel.add(label);
        panel.add(field);
        panel.add(enter);
        panel.add(New);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.add(area);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PigLatin PL = new PigLatin();
					PL.run();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}