package logica.exercicios05;

import javax.swing.JOptionPane;

public class Exercicios11 {

	public static void main(String[] args) {
		
		int diasV = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em dias: "));

		int anos = (int) diasV / 365;
		
		int restoDias = diasV % 365;
		
		int meses = (int) restoDias / 30;
		
		int dias = (int) restoDias % 30;
		
		System.out.printf("Anos: %d\nMeses: %d\nDias: %d", anos, meses, dias);
	
		
	}

}
