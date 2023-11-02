package Interfaz;

import javax.swing.JFrame;
import javax.swing.UIManager;
import java.awt.*;
import uniandes.dpoo.taller4.modelo.*;

@SuppressWarnings("serial")
public class InterfazJuegoLightsOut extends JFrame
{

	private panelConfig config;
	private PanelOpciones opciones;
	private panelPuntuacion puntuacion;
	private panelTablero panelTablero;
	private VentanaTop10 top10;
	private Tablero tablero;
	
	 int tam= 5;
     int dif= 5;
     
	public InterfazJuegoLightsOut(){
		setTitle( "LightsOut" );
        setSize( 700, 600);
        setLocationRelativeTo( null );
		setResizable( false );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        setLayout( new BorderLayout());
        
        panelTablero = new panelTablero(tablero,tam);
		add(panelTablero,BorderLayout.CENTER);
        
        config = new panelConfig(tablero);
        add(config, BorderLayout.NORTH);
        
        opciones = new PanelOpciones(tablero,this,config);
        add(opciones, BorderLayout.EAST);
        
        puntuacion = new panelPuntuacion(tablero);
        add(puntuacion, BorderLayout.SOUTH); 
        
	}
	public void nuevoTablero(Tablero tablero ,int tamanio) {
		remove(panelTablero);
		panelTablero = new panelTablero(tablero,tamanio);
		add(panelTablero,BorderLayout.CENTER);
		validate();
	}
	public void mostrarTop10()
    {
        top10 = new VentanaTop10( this);
        top10.setVisible( true );
    }
        
	public static void main( String[] pArgs )
    {
        try
        {
            // Unifica la interfaz para Mac y para Windows.
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );

            InterfazJuegoLightsOut interfaz = new InterfazJuegoLightsOut();
            interfaz.setVisible( true );
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }

	
}
	
