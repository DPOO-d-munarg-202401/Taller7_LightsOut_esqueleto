package uniandes.dpoo.taller7.interfaz3;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class panelSuperior extends JPanel implements ActionListener{
	private JLabel etiqueta;
    private JComboBox<String> comboBox;
    private JRadioButton radioButton;

    public panelSuperior(ActionListener listener) {
        
        this.setLayout(new FlowLayout());

   
        etiqueta = new JLabel("Tamanio");
        this.add(etiqueta);
        comboBox = new JComboBox<>(new String[] { "5x5", "4x4", "3x3" });
        comboBox.setActionCommand("CambiarTamano");
        comboBox.addActionListener(listener);
        this.add(comboBox);

        etiqueta = new JLabel("Dificultad");
        this.add(etiqueta);
        
        radioButton = new JRadioButton("Facil");
        this.add(radioButton);
        radioButton = new JRadioButton("Medio");
        this.add(radioButton);
        radioButton = new JRadioButton("Dificil");
        this.add(radioButton);
        
    }
	
    public JComboBox<String> getComboBox() {
        return comboBox;
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
