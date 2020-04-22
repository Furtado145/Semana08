package Semana08;

import java.util.ArrayList;

public class BlocoDeNotas {
	private ArrayList <String> notas= new ArrayList<String>();
	
	public void inserirNota(String nota) {
		notas.add(nota);
	}
	public void removerNota(String nota) {
		int posicao = buscarNota(nota);
		if(posicao >=0) {
			notas.remove(posicao);
		}
		
	}
	public int buscarNota(String nota) {
		for (int i=0; i<notas.size(); i++) {
			if(notas.get(i).equals(nota)) {
				return i;
			}
		}
		return -1;
	}
	public void alterarNota(String antiga, String nova) {
		for(int i=0; i<notas.size();i++) {
			if(notas.get(i).equals(antiga)) 
				notas.set(i, nova);
			else 
				throw new IllegalArgumentException("Nota não existe para ser substituida");
		}
	}
	
	public void listarNotas() {
		for(int i=0; i<notas.size(); i++) {
			System.out.println(notas.get(i));
		}
	}
	public String toString() {
		return "Nota:" + notas;
	}
}

