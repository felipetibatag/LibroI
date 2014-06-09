package PracticaSwingArchivos;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	Container contenedor=getContentPane();
	JButton bGuardar=new JButton("Guardar");
	JButton bImprimir=new JButton("Imprimir");
	JButton bSalir=new JButton("Salir");
	JTextField tNombre=new JTextField(20);
	JLabel lNombre =new JLabel("Nombre");
	public Ventana(){
		setTitle("Agregar Empleado");
		contenedor.setLayout(new BorderLayout());
		contenedor.add(pNorte(),BorderLayout.NORTH);
		contenedor.add(pCentro(),BorderLayout.CENTER);
		pack();
		
		setVisible(true);
		
		
	}
	public Panel pNorte(){
		Panel pnorte=new Panel();
		pnorte.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnorte.add(lNombre);
		pnorte.add(tNombre);
		return pnorte;
	}
	public Panel pCentro(){
		Panel pCentro=new Panel();
		pCentro.setLayout(new GridLayout(1,3));
		pCentro.add(bGuardar);
		pCentro.add(bImprimir);
		pCentro.add(bSalir);
		return pCentro;
	}
	

}
