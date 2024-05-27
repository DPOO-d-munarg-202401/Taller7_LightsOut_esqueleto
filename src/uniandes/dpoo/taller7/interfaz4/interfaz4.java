package uniandes.dpoo.taller7.interfaz4;
import java.awt.BorderLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JFrame;

import uniandes.dpoo.taller7.modelo.Tablero;



	
	
public class interfaz4 extends JFrame implements ActionListener{
	
	private panelSuperior panelSuperior;
	private panelDerecha panelDerecha;
	private panelInferior panelInferior;
	private panelTablero panelTablero;
	private Tablero Tablero;
	
	public interfaz4() {
	    this.setSize(600, 600);
	    this.setTitle("The lightsOut");
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setLayout(new BorderLayout());
	    
	    panelSuperior = new panelSuperior(this);
        this.add(panelSuperior, BorderLayout.NORTH);
        
        panelDerecha = new panelDerecha(this);
        this.add(panelDerecha, BorderLayout.EAST);
        
        panelInferior = new panelInferior();
        this.add(panelInferior, BorderLayout.SOUTH);
        
        panelTablero = new 	panelTablero(5); 
        this.add(panelTablero, BorderLayout.CENTER);
	
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if (comando.equals("CambiarTamano")) {
            String seleccionado = (String) panelSuperior.getComboBox().getSelectedItem();
            int nuevoTamano = Integer.parseInt(seleccionado.split("x")[0]);
            panelTablero.setTamanoTablero(nuevoTamano);
        }else if (comando.equals("REINICIAR")) {
            Tablero.reiniciar();
            panelTablero.repaint();
            
        }
    }

    public static void main(String[] args) {
        interfaz4 ventana = new interfaz4();
        ventana.setVisible(true);
    }

	

	


}
