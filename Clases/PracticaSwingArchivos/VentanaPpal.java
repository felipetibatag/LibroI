package PracticaSwingArchivos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaPpal extends JFrame{
	ListadoNombres lista=new ListadoNombres();
	Container contenedor=getContentPane();
	JButton bGuardar=new JButton("Guardar");
	JButton bImprimir=new JButton("Imprimir");
	JButton bSalir=new JButton("Salir");
	JTextField tNombre=new JTextField(20);
	JLabel lNombre =new JLabel("Nombre");
	JTextArea lResultado=new JTextArea("");
	public VentanaPpal(){
		setTitle("Agregar Empleado");
		contenedor.setLayout(new BorderLayout());
		contenedor.add(pNorte(),BorderLayout.NORTH);
		contenedor.add(pCentro(),BorderLayout.CENTER);
		contenedor.add(pSur(),BorderLayout.SOUTH);
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
	public Panel pSur(){
		Panel pSur=new Panel();
		bGuardar.addActionListener(new EventosNombres(this));
		bImprimir.addActionListener(new EventosNombres(this));
		bSalir.addActionListener(new EventosNombres(this));
		pSur.setLayout(new GridLayout(1,3));
		pSur.add(bGuardar);
		pSur.add(bImprimir);
		pSur.add(bSalir);
		
		return pSur;
	}
	 
	public Panel pCentro(){
		Panel pCentro=new Panel();
		lResultado.setBackground(Color.WHITE);
		lResultado.setText("Resultado");
		
		pCentro.setLayout(new FlowLayout(FlowLayout.CENTER));
		pCentro.add(lResultado);
		return pCentro;
	}

}
