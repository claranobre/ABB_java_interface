package br.imd;

public class Tree {
	
	private No root;
	private Tree leftTree;
	private Tree rightTree;
	
	public Tree(){
		// construtor vazio
	}
	
	public Tree getRightTree(){
		return rightTree;
	}
	
	public void setRightTree(Tree rightTree){
		this.rightTree = rightTree;
	}
	
	public Tree getLeftTree(){
		return leftTree;
	}
	
	public void setLeftTree(Tree leftTree){
		this.leftTree = leftTree;
	}
	
	 public No getRoot() {
	        return root;
	 }

	public void setRoot(No root) {
	        this.root = root;
	}
	
	public void insereAluno(int matricula, String nome) {
        Aluno aluno = new Aluno(matricula, nome);
        No no = new No(aluno);
        inserir(no);
    }

	private void inserir(No no) {
		if(this.root == null){
		   this.root = no;
		}
		else {
			if (no.getAluno().getMatricula() > this.root.getAluno().getMatricula()){
				if (this.rightTree == null){
					this.rightTree = new Tree();
				}
				this.rightTree.inserir(no);
			}
			else if (no.getAluno().getMatricula() < this.root.getAluno().getMatricula()){
				if (this.leftTree == null){
					this.leftTree = new Tree();
				}
				this.leftTree.inserir(no);
			}
		}
		
	}

	public Tree buscar(int matricula, Tree busca){
			if(matricula < busca.root.getAluno().getMatricula()){
				if(busca.leftTree == null){
					System.out.println("No não Encontrado " + matricula);
					return null;
				}
				else{
					buscar(matricula, busca.leftTree);
				}
			}
			else if(matricula == busca.root.getAluno().getMatricula()){
				System.out.println("No Encontrado, aluno: " + busca.root.getAluno().getNome());
				return busca;
			}
			else{
				if(busca.rightTree == null){
					System.out.println("No não Encontrado: " + matricula);
					return null;
				}
				else{
					buscar(matricula, busca.rightTree);
				}
			}
		return null;	
	}
		
	 public void emordem(Tree node) {
	        if(node != null){
	        	emordem(node.leftTree);
	        	System.out.println(node.root.getAluno().getMatricula() + " " + node.root.getAluno().getNome());
	        	emordem(node.rightTree);
	        }
	    }
	
	 public void prefixado(Tree node) {
		 if(node != null){
			 System.out.println(node.root.getAluno().getMatricula() + " " + node.root.getAluno().getNome());
	            prefixado(node.leftTree);
	            prefixado(node.rightTree);
	        }
	    }

	    public void posfixado(Tree node) {
	        if(node != null){
	        	posfixado(node.leftTree);
	        	posfixado(node.rightTree);
	            System.out.println(node.root.getAluno().getMatricula() + " " + node.root.getAluno().getNome());
	        }
	    }
}