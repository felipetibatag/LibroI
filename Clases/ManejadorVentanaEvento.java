import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ManejadorVentanaEvento implements ActionListener{
	VentanaEvento Ven;
	
	public ManejadorVentanaEvento(VentanaEvento v) {
		// TODO Auto-generated constructor stub
		Ven=v;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Ven.label.setText(Ven.texto.getText());
		
	}

}
