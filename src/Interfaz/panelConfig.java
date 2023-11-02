package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import uniandes.dpoo.taller4.modelo.Tablero;

@SuppressWarnings("serial")
public class panelConfig extends JPanel{

	private JComboBox<String> tamanio;
	private ButtonGroup grupodif;
	private JToggleButton facil;
	private JToggleButton normal;
	private JToggleButton dificil;
	private Tablero tablero;
	
	public panelConfig(Tablero tablero) {
		this.tablero= tablero;
		
		setBackground(Color.BLUE);
		
        setLayout( new GridLayout( 1, 6, 0, 0 ) );
        setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
        
		JLabel Label = new JLabel("Tamaño del Tablero");
		JPanel Panel = new JPanel(new GridLayout(1,3));
		Panel.add(Label);
		tamanio= new JComboBox<>(new String[]{"5x5", "6x6", "7x7"});
		Panel.add(tamanio);
		add(Panel);
		
		facil= new JToggleButton("facil");
		normal= new JToggleButton("normal");
		dificil= new JToggleButton("dificil");
		grupodif= new ButtonGroup();	
		grupodif.add(facil);
		grupodif.add(normal);
		grupodif.add(dificil);
		
		JLabel ldificultad= new JLabel("Dificultad");
		JPanel pdificultad= new JPanel(new GridLayout(1,3));
		pdificultad.add(ldificultad);
		pdificultad.add(facil);
		pdificultad.add(normal);
		pdificultad.add(dificil);
		add(pdificultad);
	}
		public int getTamanioTablero(){
		int tam=0;
		String cuadricula = (String) tamanio.getSelectedItem();
		tamanio.validate();
		if (cuadricula.equals("5x5")) {
			tam=5;
		}
		if (cuadricula.equals("6x6")) {
			tam=6;
		}
		if (cuadricula.equals("7x7")) {
			tam=7;
		}
		return tam;
		}
		
		public String getDificultad() {
		    ButtonModel selectedModel = grupodif.getSelection();
		    if (selectedModel != null) {
		        JToggleButton selectedButton = null;
		        
		        for (Enumeration<AbstractButton> buttons = grupodif.getElements(); buttons.hasMoreElements();) {
		            JToggleButton button = (JToggleButton) buttons.nextElement();
		            if (button.getModel() == selectedModel) {
		                selectedButton = button;
		                break;
		            }
		        }
		        
		        if (selectedButton != null) {
		            String selectedValue = selectedButton.getActionCommand();
		            return selectedValue;
		        }
		    }
		    
		    return "Ninguna opción seleccionada";
		}

	}
