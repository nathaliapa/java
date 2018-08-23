package lista;

import javax.swing.JOptionPane;

public class listexe1 {
	
	public static void main(String arg[]) {

	    double num1,num2;
		double soma;
		
		num1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
		
		soma=num1+num2;
		
		
		JOptionPane.showMessageDialog(null,"A soma é:"+soma);
		
		
		
	}

}
