package br.imd.vision;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaPrincipal extends JFrame{
	
	public static void main(String[] args){
		//JFrame frame = new JFrame();
		Button botoes = new Button();
		
		//frame.getContentPane().add(botoes);
		
		botoes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		botoes.setSize(800, 600);
		botoes.setTitle("Botoes");
		botoes.setVisible(true);
	}
}