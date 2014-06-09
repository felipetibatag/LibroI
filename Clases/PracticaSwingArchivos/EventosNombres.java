package PracticaSwingArchivos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventosNombres implements ActionListener{
	Ventana v;
	public EventosNombres(Ventana v) {
		// TODO Auto-generated constructor stub
		this.v=v;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==v.bGuardar){
			
		}else if(e.getSource()==v.bImprimir){
			
		}else if(e.getSource()==v.bSalir){
			v.dispose();
		}
		
	}

}
