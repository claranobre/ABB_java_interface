package br.imd.vision;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.xml.soap.Node;

public class TreeGUI extends JFrame{
	private JPanel contentPane;
	public Node node;
	public DrawTree drawer;
	
	public TreeGUI(Node node){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,500,500);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		
		drawer = new DrawTree(node);
		contentPane.add(drawer);
		setContentPane(contentPane);
		this.node = node;
		setVisible(true);
	}
}
