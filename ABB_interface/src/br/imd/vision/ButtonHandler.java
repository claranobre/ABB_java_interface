package br.imd.vision;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.imd.control.Aluno;

public class ButtonHandler extends JFrame implements ActionListener {

	private JButton insere;
	private JButton remove;
	private JButton imprime;
	private JButton busca;

	private JRadioButton preOrdem,posOrdem,emOrdem;

	private JTextField tfNome;
	private JTextField tfMatricula;
	private JLabel jbNome;
	private JLabel jbMatricula;

	public ButtonHandler(JButton insere, JButton remove, JButton imprime, JButton busca){
		this.insere = insere;
		this.remove = remove;
		this.imprime = imprime;
		this.busca = busca;
	}

	private void inicializarComponentes(){

		jbNome = new JLabel("Nome: ");
		tfNome = new JTextField("");

		jbMatricula = new JLabel("Matricula: ");
		tfMatricula = new JTextField("");

		add(jbNome);
		add(tfNome);

		add(jbMatricula);
		add(tfMatricula);

	}
	public void actionPerformed(ActionEvent evento){
		if(evento.getSource() == insere){
			JOptionPane.showMessageDialog(null, "Inserir dados do aluno: ");
		}
		if(evento.getSource() == remove){
			JOptionPane.showMessageDialog(null, "Inserir nome do aluno que você quer remover: ");
		}
		if(evento.getSource() == imprime){
			JOptionPane.showMessageDialog(null, "Arvore:");
		}
		if(evento.getSource() == busca){
			JOptionPane.showMessageDialog(null, "Buscar dados do aluno: ");
		}
	}

	private class RadioButtonHandler implements ItemListener{

		public void itemStateChanged(ItemEvent event) {
			if(preOrdem.isSelected()){
				JOptionPane.showMessageDialog(null,"Percurso em Pre Ordem");
			}
			if(posOrdem.isSelected()){
				JOptionPane.showMessageDialog(null,"Percurso em Pos Ordem");
			}
			if(emOrdem.isSelected()){
				JOptionPane.showMessageDialog(null, "Percurso em Ordem");
			}
		}
	}
}