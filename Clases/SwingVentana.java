import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SwingVentana extends JFrame{
	Container contenedor=getContentPane();
	JLabel label=new JLabel(".......");
	JTextField texto=new JTextField(10);
	JButton boton=new JButton("enviar");
	JButton boton2=new JButton("Boton2");
	
	public SwingVentana(){
		super("Ventana");
		contenedor.setLayout(new FlowLayout(FlowLayout.LEFT));
		contenedor.add(texto);
		contenedor.add(boton);
		contenedor.add(boton2);
		contenedor.add(label);
		setSize(300, 300);
		setVisible(true);
		
		boton.addActionListener(new ManejadorSwing(this));
		boton2.addActionListener(new ManejadorSwing(this));
	}
	

}
