package br.imd.vision;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javafx.scene.control.RadioButton;

public class TelaPrincipal extends JFrame{
	
	public static void main(String[] args){
		//JFrame frame = new JFrame();
		Button botoes = new Button();
		
		//frame.getContentPane().add(botoes);
		
		botoes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		botoes.setSize(800, 600);
		botoes.setTitle("Botoes");
		botoes.setVisible(true);
		
		RadioButton radioButtonFrame = new RadioButton();
		/*radioButtonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		radioButtonFrame.setSize( 450, 100 );
		radioButtonFrame.setVisible( true );*/

	}
}