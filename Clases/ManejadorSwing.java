import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ManejadorSwing implements ActionListener{
	SwingVentana vent;
	
	public ManejadorSwing(SwingVentana v) {
		// TODO Auto-generated constructor stub
		vent=v;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==vent.boton) {
			System.out.println("Se oprimio Enviar");
			vent.label.setText(vent.texto.getText());
		} else {
			System.out.println("Se oprimio el otro");
		}
		
		
	}

}
