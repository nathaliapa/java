
package lista;

import javax.swing.JOptionPane;

public class listexe11 {

	public static void mani(String arg[]) {
	double n1,n2;
	int op;
	double re;
	
	n1=Double.parseDouble(JOptionPane.showInputDialog("Digite um  numero"));
	n2=Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero"));
	op = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para soma"+"\n"+"2 para subtração"+"\n"+"3 para multiplicação"+"\n"+"4 para divisão"+"\n"));
	
			
	if(op == 1) {
		
		re=n1+n2;
		JOptionPane.showMessageDialog(null,"A soma é = "+re);
			
	}
	if(op == 2) {
		
		re=n1-n2;
		JOptionPane.showMessageDialog(null,"A subtração é = "+re);
			
	}
	if(op==3) {
	
		re=n1*n2;
		JOptionPane.showMessageDialog(null,"A Multiplicação é = "+re);
	
	}
	else {
		
		re = n1 /n2;
		JOptionPane.showMessageDialog(null,"A Divisao  é = "+re);
		
	
	}
	
}
}
