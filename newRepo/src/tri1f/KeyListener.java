package tri1f;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class KeyListener { 
    public void DigitOnly(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() //field accept numbers only
             {
                 public void keyTyped(KeyEvent ke)
                 {
                  char c = ke.getKeyChar();
                     if(!Character.isDigit(c) && (c != '\b'))
                     {
                         ke.consume();
                     }
                 }
                 public void keyReleased(KeyEvent e){}
                 public void keyPressed(KeyEvent e){}
             });
    }
}