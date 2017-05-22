package br.imd.vision;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button extends JFrame{
	private JButton insere = new JButton ("Inserir");
	private JButton remove = new JButton ("Remover");
	private JButton imprime = new JButton ("Imprimir");
	private JButton busca = new JButton ("Buscar");
	private ButtonHandler handler;
	
	public Button(){
		setLayout(new FlowLayout());
		handler = new ButtonHandler(insere, remove, imprime, busca);
		
		insere.addActionListener(handler);
		add(insere);
		
		remove.addActionListener(handler);
		add(remove);
		
		imprime.addActionListener(handler);
		add(imprime);
		
		busca.addActionListener(handler);
		add(busca);
	}
}