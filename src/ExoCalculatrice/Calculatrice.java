package ExoCalculatrice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculatrice {

	private JFrame frame;
	public JTextField textField;
	private String operateur;
	private int Chiffre1;
	private int Chiffre2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatrice window = new Calculatrice();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculatrice() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("","[39px][12px][39px][4px][41px][42.00px]", "[20px][33.00px][35.00px][35.00px][37.00px]"));

		textField = new JTextField();
		frame.getContentPane().add(textField, "cell 0 0 6 1,growx,aligny top");
		textField.setColumns(10);

		JButton Bouton1 = new JButton("1");
		Bouton1.addActionListener(Action);
		frame.getContentPane().add(Bouton1, "cell 0 1,alignx left,aligny top");

		JButton Bouton2 = new JButton(" 2 ");
		Bouton2.addActionListener(Action);
		frame.getContentPane().add(Bouton2, "cell 2 1,alignx left,aligny top");

		JButton Bouton4 = new JButton(" 4 ");
		Bouton4.addActionListener(Action);
		frame.getContentPane().add(Bouton4, "cell 0 2,alignx left,aligny top");

		JButton Bouton3 = new JButton("3");
		Bouton3.addActionListener(Action);
		frame.getContentPane().add(Bouton3, "cell 4 1,alignx left,aligny top");

		JButton BoutonPlus = new JButton("+");
		BoutonPlus.addActionListener(ActionOP);
		frame.getContentPane().add(BoutonPlus, "cell 5 1,alignx left,aligny top");
		
		JButton Bouton5 = new JButton("5");
		Bouton5.addActionListener(Action);
		frame.getContentPane().add(Bouton5, "cell 2 2,alignx left,aligny top");

		JButton Bouton7 = new JButton("7");
		Bouton7.addActionListener(Action);
		frame.getContentPane().add(Bouton7, "cell 0 3,alignx left,aligny top");

		JButton Bouton6 = new JButton("6");
		Bouton6.addActionListener(Action);
		frame.getContentPane().add(Bouton6, "cell 4 2,alignx left,aligny top");

		JButton BoutonMoins = new JButton("-");
		BoutonMoins.addActionListener(ActionOP);
		frame.getContentPane().add(BoutonMoins, "cell 5 2,alignx left,aligny top");
		
		JButton Bouton8 = new JButton("8");
		Bouton8.addActionListener(Action);
		frame.getContentPane().add(Bouton8, "cell 2 3,alignx left,aligny top");

		JButton BoutonVirg = new JButton(",");
		BoutonVirg.addActionListener(ActionOP);
		frame.getContentPane().add(BoutonVirg, "cell 0 4,alignx left,aligny top");
		
		JButton Bouton9 = new JButton("9");
		Bouton9.addActionListener(Action);
		frame.getContentPane().add(Bouton9, "cell 4 3,alignx left,aligny top");

		JButton BoutonMult = new JButton("*");
		BoutonMult.addActionListener(ActionOP);
		frame.getContentPane().add(BoutonMult, "cell 5 3,alignx left,aligny top");

		JButton Bouton0 = new JButton("0");
		Bouton0.addActionListener(Action);
		frame.getContentPane().add(Bouton0, "cell 2 4,alignx left,aligny top");

		JButton BoutonEG = new JButton("=");
		BoutonEG.addActionListener(ActionEqual);
		frame.getContentPane().add(BoutonEG, "cell 4 4,alignx left,aligny top");

		JButton BoutonDiv = new JButton("/");
		BoutonDiv.addActionListener(ActionOP);
		frame.getContentPane().add(BoutonDiv, "cell 5 4,alignx center,aligny top");
	}
	
	
	ActionListener Action = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			textField.setText(textField.getText()+" "+btn.getText()); 
		}
	};

	ActionListener ActionOP = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			if(operateur != null) {
				switch(operateur) {
				case"/":
					
					break;
				case"+":
					
					break;
				case"-":
					
					break;
				case"*":
					
					break;
				default:
					
					break;
				}
			}
		}
	};
	ActionListener ActionEqual = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			if(operateur != null) {
				switch(operateur) {
				case"/":
					break;
				case"+":
					break;
				case"-":
					break;
				case"*":
					break;
				default:
					break;
				}
			}
		}
	};
}
