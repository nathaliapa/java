
package lista;

import javax.swing.JOptionPane;

public class listexe11 {

	public static void mani(String arg[]) {
	double n1,n2;
	int op;
	double re;
	
	n1=Double.parseDouble(JOptionPane.showInputDialog("Digite um  numero"));
	n2=Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero"));
	op = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para soma"+"\n"+"2 para subtra��o"+"\n"+"3 para multiplica��o"+"\n"+"4 para divis�o"+"\n"));
	
			
	if(op == 1) {
		
		re=n1+n2;
		JOptionPane.showMessageDialog(null,"A soma � = "+re);
			
	}
	if(op == 2) {
		
		re=n1-n2;
		JOptionPane.showMessageDialog(null,"A subtra��o � = "+re);
			
	}
	if(op==3) {
	
		re=n1*n2;
		JOptionPane.showMessageDialog(null,"A Multiplica��o � = "+re);
	
	}
	else {
		
		re = n1 /n2;
		JOptionPane.showMessageDialog(null,"A Divisao  � = "+re);
		
	
	}
	
}
}
