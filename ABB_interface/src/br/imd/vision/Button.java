package br.imd.vision;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Button extends JFrame{
	private JButton insere = new JButton ("Inserir");
	private JButton remove = new JButton ("Remover");
	private JButton imprime = new JButton ("Imprimir");
	private JButton busca = new JButton ("Buscar");
		
	private ButtonHandler handler;
	private RadioButtonHandler handlerRadio;
	private JRadioButton preOrdem,posOrdem,emOrdem;
	//private RadioButtonHandler handlerRadio;
	
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
	
	public void RadioButton(){

		handlerRadio = new RadioButtonHandler();
		JLabel myLabel = new JLabel("Qual tipo de percurso você quer utilizar para ordenar?");
		preOrdem = new JRadioButton("Pre Ordem", false);
		posOrdem = new JRadioButton("Pos Ordem", false);
		emOrdem = new JRadioButton("Em Ordem",false);

		add(myLabel);
		add(preOrdem);
		add(posOrdem);
		add(emOrdem);
	}
}