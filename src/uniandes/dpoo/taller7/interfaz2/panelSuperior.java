package uniandes.dpoo.taller7.interfaz2;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class panelSuperior extends JPanel{
	private JLabel etiqueta;
    private JComboBox<String> comboBox;
    private JRadioButton radioButton;

    public panelSuperior() {
        
        this.setLayout(new FlowLayout());

   
        etiqueta = new JLabel("Tamanio");
        this.add(etiqueta);
        comboBox = new JComboBox<>(new String[] { "5x5", "4x4", "3x3" });
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
	
	

}
