package PracticaSwingArchivos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosNombres implements ActionListener{
	VentanaPpal v;
	
	public EventosNombres(VentanaPpal v) {
		// TODO Auto-generated constructor stub
		this.v=v;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==v.bGuardar){
			v.lista.agregar(new Nombres(v.tNombre.getText()));
			
		}else if(e.getSource()==v.bImprimir){
			v.lResultado.setText(v.lista.imprimir() + "\n");
			
		}else if(e.getSource()==v.bSalir){
			System.exit(0);
			v.dispose();
		}
		
	}

}
