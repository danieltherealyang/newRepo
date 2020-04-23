package newRepo.src.tri1f;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import com.sun.prism.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Dimension;

public class AP_UI 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextArea testQuestion = new JTextArea();
    private JTextArea testChoices = new JTextArea();
    private JTextArea testQuestionAnswer = new JTextArea();
	
	/**
	 * Create the frame.
	 * @wbp.parser.entryPoint
	 */
	public void run() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 784, 488);
		frame.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(220, 220, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblExamSections = new JLabel("Exam Sections");
		lblExamSections.setBounds(18, 6, 91, 16);
		contentPane.add(lblExamSections);
		
		JButton btnMath = new JButton("Math");
		btnMath.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnMath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question q = new MathQuestions();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices()); 
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		btnMath.setBounds(18, 21, 91, 29);
		contentPane.add(btnMath);
		
		JButton btnDataTypes = new JButton("Data Types");
		btnDataTypes.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnDataTypes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question q = new DataTypeQuestions();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		btnDataTypes.setBounds(264, 21, 101, 29);
		contentPane.add(btnDataTypes);
		
		JButton btnBinaryMath = new JButton("Binary Math");
		btnBinaryMath.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		btnBinaryMath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question q = new BinaryMathQuestions();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		btnBinaryMath.setBounds(144, 21, 101, 29);
		contentPane.add(btnBinaryMath);
		
		JButton btnConsole = new JButton("C");
		btnConsole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AP_Console.main();
			}
		});
		btnConsole.setForeground(Color.RED);
		btnConsole.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
		btnConsole.setBackground(Color.LIGHT_GRAY);
		btnConsole.setBounds(406, 21, 21, 18);
		contentPane.add(btnConsole);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(18, 376, 61, 16);
		contentPane.add(lblAnswer);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(74, 376, 363, 39);
		contentPane.add(scrollPane_2);
		scrollPane_2.setViewportView(testQuestionAnswer);
		
		testQuestionAnswer.setEditable(false);
		testQuestionAnswer.setLineWrap(true);
		

		JButton btnNewButton = new JButton("ʕ•ᴥ•ʔDanielAndFox");
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question q = new OperatorQuestions();
				testQuestion.setText(q.getQuestion());
				testChoices.setText(q.getChoices());
				testQuestionAnswer.setText(q.getAnswer());
			}
		});
		btnNewButton.setBounds(453, 157, 150, 39);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 62, 418, 204);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(testQuestion);
		
		testQuestion.setEditable(false);
		testQuestion.setLineWrap(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(16, 278, 418, 86);
		contentPane.add(scrollPane_1);
		scrollPane_1.setViewportView(testChoices);
		
		testChoices.setEditable(false);
		testChoices.setLineWrap(true);

	}
}
