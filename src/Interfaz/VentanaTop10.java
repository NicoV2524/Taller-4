package Interfaz;

import java.awt.BorderLayout;

import javax.swing.JDialog;

public class VentanaTop10 extends JDialog {
	
	private InterfazJuegoLightsOut principal;
	

	public VentanaTop10(InterfazJuegoLightsOut pPrincipal) {
		
		principal = pPrincipal;
		setTitle( "TOP 10" );
        setSize( 270, 200 );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
	}
}
