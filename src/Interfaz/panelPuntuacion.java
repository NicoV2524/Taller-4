package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import uniandes.dpoo.taller4.modelo.Tablero;
import uniandes.dpoo.taller4.modelo.Top10;

public class panelPuntuacion extends JPanel{

	private JTextField nombrej;
	private Tablero tablero;
	private Top10 top;
	private File t10;
	
	public panelPuntuacion(Tablero tablero) {
		this.tablero= tablero;
		setBackground(Color.BLACK);
		setLayout( new GridLayout( 1, 4, 8, 0 ));
        setBorder( new EmptyBorder( 5, 5, 5, 5 ));
        
        JLabel Labelpts = new JLabel("Puntos");
        JLabel pts = new JLabel("0");
		JPanel Panelpts = new JPanel(new GridLayout(1,2));
		Panelpts.add(Labelpts);
		Panelpts.add(pts);
		add(Panelpts);
		JLabel LabelNombre = new JLabel("Nombre");
		JTextField nombrej = new JTextField();
		JPanel PanelNombre= new JPanel(new GridLayout(1,2));
		PanelNombre.add(LabelNombre);
		PanelNombre.add(nombrej);
		add(PanelNombre);
	}
}

