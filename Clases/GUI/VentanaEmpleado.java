package GUI;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class VentanaEmpleado extends JFrame{
	JLabel lnombre=new JLabel("Nombre");
	JLabel cedula=new JLabel("Cedula");
	JLabel lTitulo=new JLabel("Registro Empleado");
	JTextField Tnombre=new JTextField(10);
	JButton bGuardar=new JButton("Guardar");
	JButton bImprimir=new JButton("Imprimir");
	private GridBagConstraints gbc=new GridBagConstraints();
	
	
	public VentanaEmpleado() {
		// TODO Auto-generated constructor stub
		Container contenedor=getContentPane();
		this.setLayout(new GridBagLayout());
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridheight=1;
		gbc.gridwidth=4;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		//gbc.fill=GridBagConstraints.HORIZONTAL;
		gbc.anchor=GridBagConstraints.NORTH;
		gbc.insets=new Insets(10, 5, 5, 5);
		contenedor.add(lTitulo,gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridheight=1;
		gbc.gridwidth=1;
		gbc.weightx=1.0;
		gbc.weighty=0.0;
		//gbc.anchor=GridBagConstraints.WEST;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		contenedor.add(lnombre,gbc);
		
		gbc.gridx=GridBagConstraints.RELATIVE;
		gbc.gridy=1;
		gbc.gridheight=2;
		gbc.gridwidth=1;
		gbc.weightx=1.0;
		gbc.weighty=0.0;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		contenedor.add(Tnombre,gbc);
		
		
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		this.setVisible(true);
		
	}
	

}
