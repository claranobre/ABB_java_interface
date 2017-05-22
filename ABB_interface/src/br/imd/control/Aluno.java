package br.imd.control;

import java.awt.event.ActionListener;

public class Aluno {
	
    private int matricula;
    private String nome;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    // Getters and Setters
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int mat) {
        this.matricula = mat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public void addActionListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}
}
