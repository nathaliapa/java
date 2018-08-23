package JOptionPane;

import javax.swing.JOptionPane;

public class exercicioif3 {

	public static void main(String arg[]) {
		
		double n1,n2;
		int op;
		double re;
		
		n1=Double.parseDouble(JOptionPane.showInputDialog("Digite um  numero"));
		n2=Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero"));
		op = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para soma, 2 para subtração, 3 para multiplicação"));
		
				
		if(op == 1) {
			
		re=n1+n2;
		JOptionPane.showMessageDialog(null,"A soma é = "+re);
			
		}
		if(op == 2) {
			
			re=n1-n2;
			JOptionPane.showMessageDialog(null,"A subtração é = "+re);
				
			}
		else {
			
			re = n1 *n2;
			JOptionPane.showMessageDialog(null,"A multiplicação é = "+re);
			
		
		}
		
	}
			
}
