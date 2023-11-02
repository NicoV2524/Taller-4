package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import uniandes.dpoo.taller4.modelo.Tablero;

public class PanelOpciones extends JPanel implements ActionListener{
	private JButton top10;
	private JButton nuevo;
	private JButton reiniciar;
	private JButton cjugador;
	private Tablero tablero;
	private InterfazJuegoLightsOut interfaz;
	private panelTablero panel;
	private panelConfig config;
	
	public PanelOpciones(Tablero tablero, InterfazJuegoLightsOut Interfaz ,panelConfig config) {
		this.tablero= tablero;
		this.interfaz= Interfaz;
		this.config= config;
		
		setBackground(Color.CYAN);
		
        setLayout( new GridLayout( 4, 1, 0, 8 ) );
        setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
        
		nuevo= new JButton("Nuevo");
		nuevo.setActionCommand("Nuevo");
        nuevo.addActionListener(this);
		nuevo.setPreferredSize( new Dimension( 200, 1 ) );
		add(nuevo);
		reiniciar= new JButton("Reinicar");
		reiniciar.setActionCommand("Reiniciar");
        reiniciar.addActionListener(this);
		reiniciar.setPreferredSize( new Dimension( 200, 1 ) );
		add(reiniciar);
		top10= new JButton("TOP 10");
		top10.setActionCommand("TOP 10");
        top10.addActionListener(this);
		top10.setPreferredSize( new Dimension( 200, 1 ) );
		add(top10);
		cjugador= new JButton("Cambiar Jugador");
		cjugador.setActionCommand("Cambiar Jugador");
        cjugador.addActionListener(this);
		cjugador.setPreferredSize( new Dimension( 200, 1 ) );
		add(cjugador);
	}
	public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand( );

		if( comando.equals("Nuevo") )
        {
			System.out.println("Presionar Nuevo");
			int tamanio=config.getTamanioTablero();
			String dif= config.getDificultad();
            interfaz.nuevoTablero(tablero,tamanio);
            System.out.println("Se selecciono dificultad: " + dif + "en tablero de " + tamanio + "x"+tamanio);
        }
        else if( comando.equals("Reiniciar") )
        {
            System.out.println("Presionar Reiniciar");
        }
        else if( comando.equals("TOP 10") )
        {
        	System.out.println("Presionar Top 10");
        	interfaz.mostrarTop10();
        }
        else if( comando.equals("Cambiar Jugador" ))
        {
        	System.out.println("Presionar Cambiar Jugador");
        }
    }
}
