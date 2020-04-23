package newRepo.src.tri1f;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class MonkeyJumpers {
    JFrame frame;
    public void add() {
        frame = new JFrame("MonkeyJumpers");                 
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
        frame.setSize(new Dimension(700,400));
        frame.setLocationRelativeTo(null);
        JLabel jumper = new JLabel("Jumper");
        JTextField field1 = new JTextField(15);
        JLabel numJumper = new JLabel("How many jumpers?");
        JTextField field2 = new JTextField(8);
        	KeyListener keyListener = new KeyListener();
        	keyListener.DigitOnly(field2);
        JPanel panel = new JPanel();
        
        JTextArea area = new JTextArea();
        area.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        area.setEditable(false);
        
        JButton enter = new JButton("Enter");
        enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String jumpers = field1.getText();
                String numJumpers = field2.getText();
                int number = Integer.parseInt(numJumpers);
                runJumpers(number,jumpers,area);
                field1.setEditable(false);
                field2.setEditable(false);
            }
        });
        
        JButton New = new JButton("New");
        New.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		area.setText("");
        		field1.setText("");
        		field2.setText("");
        		field1.setEditable(true);
        		field2.setEditable(true);
        	}
        });
        
        
        
        panel.add(jumper);
        panel.add(field1);
        panel.add(numJumper);
        panel.add(field2);
        panel.add(enter);
        panel.add(New);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.add(area);
        frame.setVisible(true);
    }
    
    public void runJumpers(int number, String jumpers, JTextArea area)
    {
        while (number > -1)
            {
                String space = " ";
                if (number == 0)
                {
                    area.append("Zero little" + space + jumpers + space + "jumping on the bed" + '\n');
                }
                else
                {
                    area.append(number + space + "little" + space + jumpers + space + "jumping on the bed" + '\n');
                    area.append("One fell off and broke his head" + '\n');
                    area.append("Mama called the doctor and the doctor said" + '\n');
                    area.append("no more"+ space + jumpers + space + "jumping on the bed." + '\n');
                }
                number--;
            }
    }
    
    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MonkeyJumpers mJ = new MonkeyJumpers();
					mJ.add();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}