package uniandes.dpoo.taller7.interfaz3;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class tablero extends JPanel {
	
	private int tamanoTablero;

    public tablero(int tamanoInicial) {
        this.tamanoTablero = tamanoInicial;
        this.setPreferredSize(new Dimension(300, 300)); 
    }

    public void setTamanoTablero(int tamano) {
        this.tamanoTablero = tamano;
        this.revalidate();
        this.repaint(); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int ancho = getWidth();
        int alto = getHeight();
        int tamanoCelda = Math.min(ancho, alto) / tamanoTablero;

        g2d.setColor(Color.YELLOW);
        for (int i = 0; i < tamanoTablero; i++) {
            for (int j = 0; j < tamanoTablero; j++) {
                g2d.fillRect(i * tamanoCelda, j * tamanoCelda, tamanoCelda, tamanoCelda);
                g2d.setColor(Color.BLACK);
                g2d.drawRect(i * tamanoCelda, j * tamanoCelda, tamanoCelda, tamanoCelda);
                g2d.setColor(Color.YELLOW);
            }
        }
    }

}
