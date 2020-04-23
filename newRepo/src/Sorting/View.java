package newRepo.src.Sorting;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class View {
    private Model m_model;
    private JFrame m_frame;
    private Visual visual = new Visual();
    static final int width = 700;
    static final int height = 400;
    private JPanel panel = new JPanel();
    private JLabel label = new JLabel();
    private JTextField element = new JTextField(10);
    private JButton addElement = new JButton("Add to Array");
    private JButton sort = new JButton("Sort");
    private JButton reset = new JButton("Reset");
    private ArrayList<Integer> List;
    
    View(Model model, JFrame frame) {
        m_model = model;
        m_frame = frame;
        m_frame.setLocationRelativeTo(null);        
        label.setText("Enter number (not too big): ");
        element.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (!Character.isDigit(c) && (c != '\b')) {
                    ke.consume();
                }
            }
            public void keyReleased(KeyEvent e){}
            public void keyPressed(KeyEvent e){}
        });
        
        element.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    addElement.doClick();
                }
            }
        });
        
        panel.setOpaque(false);
        panel.add(label);
        panel.add(element);
        panel.add(addElement);
        panel.add(sort);
        panel.add(reset);
        m_frame.getContentPane().add(BorderLayout.SOUTH, panel);
        m_frame.getContentPane().add(visual);
        m_frame.pack();
        m_frame.setVisible(true);
    }
    
    int getElement() {
        int newElement = Integer.parseInt(element.getText());
        return newElement;
    }
    
    void setList(ArrayList<Integer> List) {
        this.List = List;
    }
    
    void clearElementField() {
        element.setText("");
    }
    
    void addElementListener(ActionListener ElementListener) {
        addElement.addActionListener(ElementListener);
    }
    
    void addSortListener(ActionListener SortListener) {
        sort.addActionListener(SortListener);
    }
    
    void addResetListener(ActionListener ResetListener) {
        reset.addActionListener(ResetListener);
    }
    
    void resetVisual() {
        visual.removeAll();
        visual.repaint();
    }
    
    void update() {
        visual.setArrayList(List);
        visual.repaint();
    }
}