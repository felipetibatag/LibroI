package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PracticaGui1 extends JFrame{
	public JCheckBox chin,glasses,hair,teeth;
	public ImageIcon icono=new ImageIcon("copa.jpg");
	public JLabel imagen=new JLabel(icono);
	public ButtonGroup opcionesGrupo=new ButtonGroup();
	private JPanel opcPanel;
	private Container contenedor=getContentPane();
	private GridBagConstraints gbc=new GridBagConstraints();
	
	public PracticaGui1() {
		// TODO Auto-generated constructor stub
		setLayout(new GridBagLayout());
		opcPanel=new JPanel();
		opcPanel.setLayout(new GridLayout(4, 1));
		contenedor.add(opcPanel);
		((JPanel)contenedor).setBorder(BorderFactory.createTitledBorder("Practica"));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		imagen.setBorder(BorderFactory.createBevelBorder(NORMAL));
		
		
		chin=new JCheckBox("CHIN");
		opcPanel.add(chin);
		
		
		glasses=new JCheckBox("Glasses");
		opcPanel.add(glasses);
		
		hair=new JCheckBox("Hair");
		opcPanel.add(hair);

		teeth=new JCheckBox("Teeth");
		opcPanel.add(teeth);
		
		
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridheight=4;
		gbc.gridwidth=1;
		gbc.weightx=0.0;
		gbc.weighty=0.0;
		gbc.anchor=GridBagConstraints.FIRST_LINE_START;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		
		gbc.insets=new Insets(0, 5, 5, 5);
		contenedor.add(opcPanel,gbc);
		
		
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridheight=4;
		gbc.gridwidth=4;
		gbc.weightx=1.0;
		gbc.weighty=1.0;
		gbc.fill=GridBagConstraints.BOTH;
		gbc.anchor=GridBagConstraints.PAGE_START;
		contenedor.add(imagen,gbc);
		
		
		
		opcionesGrupo.add(chin);
		opcionesGrupo.add(glasses);
		opcionesGrupo.add(hair);
		opcionesGrupo.add(teeth);
		
		this.pack();
		this.setVisible(true);
		
	}
	
	
	

}
