package newRepo.src.tri1f;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ArrayListJList
{
    
	public static int findThePrime(int input){
	       //instantiate an integer ArrayList
	       int i = 0;
	       java.util.ArrayList<Integer> primes = new java.util.ArrayList<Integer>(); 
	       //Use a do-while loop to add primes into this ArrayList until we reach the prime that starts with the digits "input"
	       do {
	           if (primeChecker(i)) {
	    		   primes.add(i);
	    		   i++;
	    	   } else {
	    		   i++;
	    	   }
	           
	           if (primeChecker(i) && isStarter(i,input)) {
	    	   primes.add(i);
	           }
	       } while (!isStarter(i,input) || !primeChecker(i)); 
	       
	       return i;
	   }
	    
	   public static JList listOfPrimes(int input){
	        //copy-paste code from findThePrime, but instead of returning "test," return the ArrayList
	        int i = 0;
	       java.util.ArrayList<Integer> primes = new java.util.ArrayList<Integer>(); 
	       //Use a do-while loop to add primes into this ArrayList until we reach the prime that starts with the digits "input"
	       do {
	           if (primeChecker(i)) {
	    		   primes.add(i);
	    		   i++;
	    	   } else {
	    		   i++;
	    	   }
	           
	           if (primeChecker(i) && isStarter(i,input)) {
		    	   primes.add(i);
		       }
	       } while (!isStarter(i,input) || !primeChecker(i)); 
	       
	       JList list = new JList(primes.toArray());
	       return list;
	    }
	   
	    
	   public static boolean isStarter (int candidate, int starter){
	        
	        boolean decision = false;
	        
	        String digitString = Integer.toString(candidate);
	      if(candidate>9){
	       String firstTwoDigits = digitString.substring(0,2);
	       if(firstTwoDigits.equals(Integer.toString(starter))){
	          decision = true;}
	      }
	      
	      return decision;
	   }
	    
	   public static boolean primeChecker(int candidate){
	     
	        int primeScore = 0;
	        boolean isPrime = false;
	        
	        for(int d = 1; d <= Math.floor(Math.sqrt(candidate)); d++){
	         if(candidate%d == 0){
	             primeScore = primeScore + 1;
	            } 
	        }  
	        if(primeScore == 1){
	             isPrime = true;
	        }
	        
	        return isPrime;
	   }
	   
   JFrame frame;
   public void add() {
       frame = new JFrame("ArrayListJList");                 
       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
       frame.setSize(new Dimension(700,400));
       frame.setLocationRelativeTo(null);
       
       JTextField field1 = new JTextField(15);
       	KeyListener keyListener = new KeyListener();
       	keyListener.DigitOnly(field1);
       JPanel panel = new JPanel();
       
       JTextArea area = new JTextArea();
       area.setBorder(BorderFactory.createLineBorder(Color.BLACK));
       area.setEditable(false);
       
       JButton enter = new JButton("Enter");
       enter.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
        	   int input = Integer.parseInt(field1.getText());
        	   if (field1.getText().length() >= 2 ) {
        		   area.append("Fullscreen to see ArrayList" + '\n');
	        	   area.append("Your number: " + input + '\n');
	               area.append("Your prime: " + findThePrime(input) + '\n');
	               area.append("Your ArrayList: " + '\n');
	               JList list = listOfPrimes(input);
	               JScrollPane scrollPane = new JScrollPane(list);
	               Container contentPane = frame.getContentPane();
	               contentPane.add(scrollPane, BorderLayout.CENTER);
	               field1.setEditable(false);
        	   } else {
        		   area.append("input must be at least 2 digits");
        		   field1.setEditable(false);
        	   }
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
       
       
       
       panel.add(field1);
       panel.add(enter);
       panel.add(New);
       frame.getContentPane().add(BorderLayout.SOUTH, panel);
       frame.add(area);
       frame.setVisible(true);
   }
}