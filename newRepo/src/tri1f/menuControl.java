package tri1f;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.Color;

public class menuControl extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Action action = new SwingAction();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuControl frame = new menuControl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public menuControl() {
		getContentPane().setBackground(Color.GREEN);
		getContentPane().setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.CYAN);
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("Midterm");
		menuBar.add(mnFile);
		
		JMenu mnCalculator = new JMenu("Intro");
		menuBar.add(mnCalculator);
		
		JMenuItem mnJumpers = new JMenuItem("Jumpers");
		mnJumpers.setBackground(Color.CYAN);
		mnJumpers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MonkeyJumpers monkeyJumpers = new MonkeyJumpers();
                monkeyJumpers.add();
			}
		});
		mnCalculator.add(mnJumpers);
		
		JMenu mnNewMenu = new JMenu("Sprint 1");
		mnNewMenu.setBackground(Color.WHITE);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmShorthand = new JMenuItem("Shorthand");
		mntmShorthand.setBackground(Color.PINK);
		mntmShorthand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShortHand shorthand = new ShortHand();
				shorthand.add();				
			}
		});
		mnNewMenu.add(mntmShorthand);
		
		JMenuItem mntmPigLatin = new JMenuItem("PigLatin");
		mntmPigLatin.setBackground(Color.YELLOW);
		mntmPigLatin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
                PigLatin pigLatin = new PigLatin();
                pigLatin.run();
            }
        });
		mnNewMenu.add(mntmPigLatin);
		
		JMenuItem mntmPalindromeIJ = new JMenuItem("Palindrome IJ");
		mntmPalindromeIJ.setBackground(Color.MAGENTA);
		mntmPalindromeIJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PalindromeIJ palindromeIJ = new PalindromeIJ();
                palindromeIJ.check();
			}
		});
		mnNewMenu.add(mntmPalindromeIJ);
		
		JMenuItem mntmPalindromeRec = new JMenuItem("Palindrome Recursion");
		mntmPalindromeRec.setBackground(Color.BLUE);
		mntmPalindromeRec.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PalindromeRec palindromeRec = new PalindromeRec();
                palindromeRec.check();
            }
        });
		mnNewMenu.add(mntmPalindromeRec);
		
		JMenuItem mntmPalindromeRev = new JMenuItem("Palindrome ReverseString");
		mntmPalindromeRev.setBackground(Color.LIGHT_GRAY);
		mntmPalindromeRev.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                PalindromeRev palindromeRev = new PalindromeRev();
                palindromeRev.check();
            }
        });
		mnNewMenu.add(mntmPalindromeRev);
		
		JMenu mnSprint = new JMenu("Sprint 2");
		mnSprint.setBackground(Color.WHITE);
		menuBar.add(mnSprint);
		
		JMenuItem mntmCalculator = new JMenuItem("Calculator");
		mntmCalculator.setBackground(Color.ORANGE);
		mntmCalculator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F calculator = new F();
				calculator.run();
			}
		});
		mnSprint.add(mntmCalculator);
		
		JMenuItem mntmArrayList = new JMenuItem("ArrayList");
		mntmArrayList.setBackground(Color.RED);
		mntmArrayList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList arrayList = new ArrayList();
				arrayList.add();
			}
		});
		mnSprint.add(mntmArrayList);
		
		JMenuItem mntmArrayListJList = new JMenuItem("ArrayListJList");
		mntmArrayListJList.setBackground(Color.CYAN);
		mntmArrayListJList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayListJList arrayListJList = new ArrayListJList();
				arrayListJList.add();
			}
		});
		
		mnSprint.add(mntmArrayListJList);
		
		JMenu mnAPTest = new JMenu("APTest");
		mnAPTest.setBackground(Color.WHITE);
		menuBar.add(mnAPTest);
		JMenuItem mntmAPrun = new JMenuItem("Run APTest");
		mntmAPrun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				APTest apTest = new APTest();
				apTest.run();
			}
		});
		mnAPTest.add(mntmAPrun);
	}
	
	
	
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
