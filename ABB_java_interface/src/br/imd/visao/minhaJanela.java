package br.imd.visao;

import javax.swing.JFrame;

public class minhaJanela extends JFrame{
	
	public minhaJanela(){
		setSize(400,350);
		setTitle("Árvore Binária de Busca");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		minhaJanela janela = new minhaJanela();
		janela.setVisible(true);
	}
}
