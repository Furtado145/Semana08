package Semana08;

import javax.swing.JOptionPane;

public class AppBloco {
	
	public static void main(String[] ard) {
		String menu = "1) Insira uma nota\n" 
				+ "2) Remova uma nota\n"
				+ "3) Altere uma nota\n"
				+ "4) Listar todas as notas\n"
				+ "5) Sair do sistema.";
		int opcao;
		String nota = null;
			
		do {
			opcao = Integer.parseInt(
					JOptionPane.showInputDialog(menu));
			
			switch(opcao) {
				case 1:{
					nota = JOptionPane.showInputDialog("Nota: ");
					new BlocoDeNotas().inserirNota(nota);
					break;
				}
				case 2:{
					nota = JOptionPane.showInputDialog("Nota para remover: ");
					new BlocoDeNotas().removerNota(nota);
					break;
				}
				case 3:{
					String velha = JOptionPane.showInputDialog("Qual nota deve ser trocada?");
					String nova = JOptionPane.showInputDialog("Qual sera a nova nota?");
					new BlocoDeNotas().alterarNota(velha, nova);
					break;
				}
				case 4:{
					new BlocoDeNotas().listarNotas();
					break;
				}
				case 5:
					JOptionPane.showMessageDialog(null, "Até mais");
			}
		}while(opcao != 5);
	}
}
