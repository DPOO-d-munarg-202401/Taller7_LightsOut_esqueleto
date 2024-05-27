package uniandes.dpoo.taller7.interfaz2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class interfaz2 extends JFrame implements ActionListener{
	
	private panelSuperior panelSuperior;
	private panelDerecha panelDerecha;
	private panelInferior panelInferior;
	
	public interfaz2() {
	    this.setSize(600, 600);
	    this.setTitle("The lightsOut");
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setLayout(new BorderLayout());
	    
	    panelSuperior = new panelSuperior();
        this.add(panelSuperior, BorderLayout.NORTH);
        
        panelDerecha = new panelDerecha();
        this.add(panelDerecha, BorderLayout.EAST);
        
        panelInferior = new panelInferior();
        this.add(panelInferior, BorderLayout.SOUTH);
	
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
        interfaz2 ventana = new interfaz2();
        ventana.setVisible(true);
    }

}
