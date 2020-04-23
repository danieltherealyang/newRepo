package newRepo.src.Sorting;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.util.*;
public class Controller {
    private Model m_model;
    private View m_view;
    private ArrayList<Integer> List;
    Controller(Model model, View view) {
        m_model = model;
        m_view = view;
        
        view.addElementListener(new ElementListener());
        view.addSortListener(new SortListener());
        view.addResetListener(new ResetListener());
    }
    
    class ElementListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int newElement = m_view.getElement();
            m_model.add(newElement);
            m_view.clearElementField();
            List = m_model.toList();
            m_view.setList(List);
            m_view.update();
            System.out.println(m_model);
        }
    }
    
    class SortListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m_model.selectionSort();
            List = m_model.toList();
            m_view.setList(List);
            m_view.update();
            System.out.println(m_model);
        }
    }
    
    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m_model.clear();
            List = m_model.toList();
            m_view.setList(List);
            m_view.resetVisual();
        }
    }
}