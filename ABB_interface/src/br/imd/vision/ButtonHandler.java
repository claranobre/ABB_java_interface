package br.imd.vision;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ButtonHandler implements ActionListener {

	private JButton inserir, salvar;
	private ButtonHandler handler;

	public ButtonHandler(JButton inserir, JButton salvar) {
		this.inserir = inserir;
		this.salvar = salvar;
	}

	public void actionPerfomed(ActionEvent evento){
		setLayout(new FlowLayout());
		handler = new ButtonHandler(inserir,salvar);
		
		if(evento.getSource() == inserir){
			JOptionPane.showMessageDialog(null, "Inserir dados do aluno");
			inserir.addActionListener(handler);
			add(inserir);
			
			
			inserir.addActionListener(new ActionListener(){
			
				setLayout(new FlowLayout());
						
				inserir = new JButton("Inserir");
				inserir.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent evento){
							if(evento.getSource() == inserir)
								JOptionPane.showMessageDialog(null, inserir.getText());
								
							}
						}
						);
						add(inserir);
					}

				private void add(JButton inserir) {
					// TODO Auto-generated method stub
					
				}

				private void setLayout(FlowLayout flowLayout) {
					// TODO Auto-generated method stub
					
				

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}}
				});
			
		}if(evento.getSource()==salvar)

	{
		JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");
	}
}}
