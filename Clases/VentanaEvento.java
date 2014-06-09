import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;


public class VentanaEvento extends Frame{
	TextField texto=new TextField(10);
	Button boton=new Button("Enviar");
	Label label=new Label(".......");
	public VentanaEvento(){
		super("Ventana2");
		setLayout(new FlowLayout());
		add(texto);
		add(boton);
		add(label);
		setSize(300,300);
		ManejadorVentanaEvento b=new ManejadorVentanaEvento(this);
		boton.addActionListener(b);
		setVisible(true);
		
	}
	
	
	

}
