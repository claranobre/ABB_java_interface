package br.imd.control;

import java.awt.Component;

import javax.swing.JFrame;

import br.imd.vision.TreeGUI;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Arvore Binaria de Busca");
		frame.setSize(800, 600);
		
		/**
		 * Método principal sem interface grafica
		 */
		Tree raiz = new Tree();
		raiz.insereAluno(2015, "felipe");
		raiz.insereAluno(2014, "ana");
		raiz.insereAluno(2017, "salgado");
		raiz.insereAluno(2012, "pedin");
		raiz.buscar(2013, raiz);
		raiz.buscar(2015, raiz);

		System.out.println("Pre Ordem: ");
		raiz.emordem(raiz);
		System.out.println("Pre Ordem: ");
		raiz.prefixado(raiz);
		System.out.println("Pos Ordem: ");
		raiz.posfixado(raiz);
	
	}
}