package lista;

import javax.swing.JOptionPane;

public class listexe7 {
	
	public static void mani(String arg[]) {
		
		double temp;
		temp=Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius"));
		double conversao;
		conversao= (9*temp+160)/5;
		
		JOptionPane.showMessageDialog(null,"A temperatura em  Fahrenheit é = " +conversao);
		
	}

}
