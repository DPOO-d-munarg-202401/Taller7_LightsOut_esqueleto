package uniandes.dpoo.taller7.interfaz2;

import java.awt.GridLayout;

import javax.swing.JPanel;

import javax.swing.JButton;

public class panelDerecha extends JPanel{

	private JButton button;
	
	public panelDerecha() {
		 this.setLayout(new GridLayout(0, 1));  

		
		button = new JButton("NUEVO");
        this.add(button);
        
        button = new JButton("REINICIAR");
        this.add(button);
        
        button = new JButton("TOP-10");
        this.add(button);
        
        button = new JButton("CAMBIAR JUGADOR");
        this.add(button);
		
	}
}
