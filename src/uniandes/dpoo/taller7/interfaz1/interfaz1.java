package uniandes.dpoo.taller7.interfaz1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class interfaz1 extends JFrame implements ActionListener {
	
	public interfaz1() {
	    this.setSize(300, 400);
	    this.setTitle("The lightsOut");
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setLayout(new BorderLayout());
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
        interfaz1 ventana = new interfaz1();
        ventana.setVisible(true);
    }

	
}
