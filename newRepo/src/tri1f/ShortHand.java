package newRepo.src.tri1f;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ShortHand {
	JFrame frame;
    public void add() {
        frame = new JFrame("Shorthand");                 
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
        frame.setSize(new Dimension(700,400));
        frame.setLocationRelativeTo(null);
        JLabel Message = new JLabel("Message");
        JTextField field1 = new JTextField(15);
        JPanel panel = new JPanel();
        
        JTextArea area = new JTextArea();
        area.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        area.setEditable(false);
        
        JButton enter = new JButton("Enter");
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = field1.getText();
                run(message,area);
                field1.setEditable(false);
            }
        });
        
        JButton New = new JButton("New");
        New.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		area.setText("");
        		field1.setText("");
        		field1.setEditable(true);
        	}
        });
        
        panel.add(Message);
        panel.add(field1);
        panel.add(enter);
        panel.add(New);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.add(area);
        frame.setVisible(true);
    }
    
    public void run(String message,JTextArea area) {
    	String[] words = message.split("\\s+");
        String space = " ";
        for (int i = 0; i < words.length; i++)
        {
            String noVowel = words[i].replaceAll("[AEIOUaeiou]", "");
            if (noVowel.matches("(?i)nd"))
            {
                area.append("&" + space);
            } else
            if (noVowel.matches("(?i)t"))
            {
            	area.append("2" + space);
            } else
            if (noVowel.matches("(?i)y"))
            {
            	area.append("U" + space);
            } else 
            if (noVowel.matches("(?i)fr"))
            {
            	area.append("4" + space);
            } else
            {
            	area.append(noVowel + space);
            }
        }
    }
    
    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShortHand SH = new ShortHand();
					SH.add();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
