package lista;

import javax.swing.JOptionPane;

public class listexe8 {
	
public static void main(String arg[]) {
		
		double real, cotacao, dolar;
		dolar=Double.parseDouble(JOptionPane.showInputDialog("Digite a qauntidade de dolar"));
	
		cotacao=Double.parseDouble(JOptionPane.showInputDialog("Digite a cota��o"));
		
		real= dolar * cotacao;
		
		JOptionPane.showMessageDialog(null,"Dolar="+ dolar +"\n"+"Cota��o=" +
		cotacao +"\n"+ "Valor em real="+ real + "\n");
		
		
	}

}
