import java.awt.FlowLayout;
import java.awt.Frame;


public class Ventana extends Frame{
	
	public Ventana(){
		super("Vetana");
		//setLayout(new FlowLayout());
		setSize(300,300);
		GestionVentana2 gVentana=new GestionVentana2();
		this.addWindowListener(gVentana);
		setVisible(true);
	}

}
