package banco;

import javax.swing.JOptionPane;

public class imobiliario {
	public static void main(String[] args) {
		int[] num = {200, 100, 50, 20, 10, 5, 2, 1};
		int[] qtd = {10, 10, 10, 10, 10, 10, 10, 10};
		int[] notas = {0, 0, 0, 0, 0, 0, 0, 0};
		int valor;
		int n = 1;
		int c;
		Object[] a = {"Sim", "Não"};
		
		do{
			String saida = "";
			valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor que deseja sacar:"));
			for(int x = 0; x < 8; x++) {
				notas[x] = valor / num[x];
				if (notas[x] >= qtd[x]) {
					notas[x] = qtd[x];
				}
				valor -= notas[x] * num[x];
				qtd[x] = qtd[x] - notas[x];
				if(notas[x] != 0) {
					saida += notas[x] + " - " + num[x] + "\n";	
				}
			}
			JOptionPane.showMessageDialog(null, saida, "Notas", 1);
			
			
			c = JOptionPane.showOptionDialog(null, "Deseja continuar", "Sair?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, a, "Sim");
			
			if(c == JOptionPane.NO_OPTION) {
				n++;
			}
		} while (n == 1);
			
	}
}
