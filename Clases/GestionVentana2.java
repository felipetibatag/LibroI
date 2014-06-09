import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GestionVentana2 extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		Ventana v=(Ventana)e.getSource();
		v.dispose();
		
	}

}
