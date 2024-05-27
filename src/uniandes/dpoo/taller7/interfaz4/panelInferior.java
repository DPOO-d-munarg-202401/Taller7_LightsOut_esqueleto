package uniandes.dpoo.taller7.interfaz4;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;

public class panelInferior extends JPanel{

	private JLabel etiqueta;
	private JTextField textField;
	
	public panelInferior() {
		
		this.setLayout(new FlowLayout());
		
		etiqueta = new JLabel("Jugadas");
		this.add(etiqueta);
		
		textField = new JTextField(15); 
        this.add(textField);
        
        etiqueta = new JLabel("Jugador");
		this.add(etiqueta);
		
		textField = new JTextField(15); 
        this.add(textField);
	}
}
