package GUI;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaCHAT extends JFrame implements ActionListener{
	private JTextArea area;
	private JTextField text;
	private JScrollPane scroll;
	private JButton boton;
	
	public VentanaCHAT() {
		// TODO Auto-generated constructor stub
		super("GridBagLayout");
		this.setSize(300,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		area=new JTextArea();
		scroll=new JScrollPane(area);
		text=new JTextField(20);
		boton=new JButton("Enviar");
		gbc.gridx=0; //especifica la posicion del elemento en fila
		gbc.gridy=0; // especifica la posicion del elemento en columna
		gbc.gridwidth=2; //cuantas columnas ocupara el elemento
		gbc.gridheight=1;  // cuantas filas ocupara el elemento
		gbc.weightx=1.0; //que tanto (cantidad)crece cuando se expande la ventana
		gbc.weighty=1.0; //que tanto (cantidad)crece cuando se expande la ventana
		gbc.fill=GridBagConstraints.BOTH; // la forma en la que crece horizontal, vertical, ambos, etc.
		add(scroll,gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1.0;
		gbc.weighty=0.0;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		add(text,gbc);
		
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=0.0;
		gbc.weighty=0.0;
		gbc.fill=GridBagConstraints.NONE;
		add(boton,gbc);
		
		boton.addActionListener(this);
		this.setVisible(true);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==boton){
			area.append(text.getText() + "\n");
		}
	}

}
