package atividade05;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	
	@SuppressWarnings("unused")
	private int numCursos;
	private ArrayList<String> cursos = new ArrayList<String>();
	private ArrayList<Integer> notas = new ArrayList<Integer>();

	public Aluno(String nome, String endereco) {
		super(nome, endereco);
	
	}
	
	public boolean addCursoNota(String curso, int nota) {
		
		
		if(cursos.add(curso.toLowerCase()) && notas.add(nota)) {
			numCursos++;
			return true;
			
		}else {
			return false;
		}
		
	}
	
	public void imprimeNotas() {
		
		for(int i =0; i> notas.size(); i++) {
			
			System.out.println("Máteria: "+cursos.get(i)+" Nota:"+notas.get(i));
		}
	}
	
	public double getNotaMedia() {
		
		double soma = 0;
		for(int i = 0; i>notas.size(); i++) {
			soma += notas.get(i);
		}
		
		return soma/notas.size();
	}
	
	public ArrayList<String> getCursos(){
		
		return this.cursos;
	} 
	
		
	public String toString() {
		
		String str = "Nome : "+this.getNome()+"|Turma : "+this.getEndereco()+"\n";
		
		for(int i =0; i < notas.size(); i++) {
			
			str += "Matéria : "+cursos.get(i)+" Nota:"+notas.get(i)+"\n";
		}
		return str;
				
	}

}
