package uniandes.dpoo.taller7.interfaz3;
import java.awt.BorderLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JFrame;



	
	
public class interfaz3 extends JFrame implements ActionListener{
	
	private panelSuperior panelSuperior;
	private panelDerecha panelDerecha;
	private panelInferior panelInferior;
	private tablero panelTablero;
	
	public interfaz3() {
	    this.setSize(600, 600);
	    this.setTitle("The lightsOut");
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setLayout(new BorderLayout());
	    
	    panelSuperior = new panelSuperior(this);
        this.add(panelSuperior, BorderLayout.NORTH);
        
        panelDerecha = new panelDerecha();
        this.add(panelDerecha, BorderLayout.EAST);
        
        panelInferior = new panelInferior();
        this.add(panelInferior, BorderLayout.SOUTH);
        
        panelTablero = new tablero(5); 
        this.add(panelTablero, BorderLayout.CENTER);
	
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if (comando.equals("CambiarTamano")) {
            String seleccionado = (String) panelSuperior.getComboBox().getSelectedItem();
            int nuevoTamano = Integer.parseInt(seleccionado.split("x")[0]);
            panelTablero.setTamanoTablero(nuevoTamano);
        }
    }

    public static void main(String[] args) {
        interfaz3 ventana = new interfaz3();
        ventana.setVisible(true);
    }

	

	


}
