package Interfaz;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import uniandes.dpoo.taller4.modelo.Tablero;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class panelTablero extends JPanel{
	
	private Tablero tablero;
	private BufferedImage imagen;
	private Graphics grafico;
	
	public panelTablero(Tablero tablero, int tam) {
	    this.tablero = tablero;
	    setBackground(Color.GRAY);
	    tablero=new Tablero(tam);
	    setLayout(new GridLayout(tam, tam, 1, 1));
	    setBorder(new EmptyBorder(0, 0, 0, 0));

	    for (int c = 0; c < tam; c++) {
	        for (int f = 0; f < tam; f++) {
	            JPanel panel = new JPanel(new GridBagLayout()); // Cambio a GridBagLayout
	            panel.setBorder(new EmptyBorder(0, 0, 0, 0));
	            panel.setBackground(Color.YELLOW);
	            tablero.desordenar(5);
	            JLabel label = new JLabel();
	            ImageIcon icon = new ImageIcon("data/luz.png");
	            label.setIcon(icon);
	            GridBagConstraints gbc = new GridBagConstraints();
	            gbc.gridx = 0;
	            gbc.gridy = 0;
	            panel.add(label, gbc);
	            add(panel);
	        }
	    }
	}

}
