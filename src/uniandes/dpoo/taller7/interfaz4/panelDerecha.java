package uniandes.dpoo.taller7.interfaz4;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import javax.swing.JButton;

public class panelDerecha extends JPanel {

	private JButton button;
	
	public panelDerecha(ActionListener listener) {
		 this.setLayout(new GridLayout(4, 1));  

		
		button = new JButton("NUEVO");
		button.setActionCommand("NUEVO");
        button.addActionListener(listener);
        this.add(button);
        
        button = new JButton("REINICIAR");
        button.setActionCommand("REINICIAR");
        button.addActionListener(listener);
        this.add(button);
        
        button = new JButton("TOP-10");
        button.setActionCommand("TOP-10");
        button.addActionListener(listener);
        this.add(button);
        
        button = new JButton("CAMBIAR JUGADOR");
        button.setActionCommand("CAMBIAR JUGADOR");
        button.addActionListener(listener);
        this.add(button);
		
	}
}
