package JOptionPane;

import javax.swing.JOptionPane;

public class exercicioif3 {

	public static void main(String arg[]) {
		
		double n1,n2;
		int op;
		double re;
		
		n1=Double.parseDouble(JOptionPane.showInputDialog("Digite um  numero"));
		n2=Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero"));
		op = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para soma, 2 para subtra��o, 3 para multiplica��o"));
		
				
		if(op == 1) {
			
		re=n1+n2;
		JOptionPane.showMessageDialog(null,"A soma � = "+re);
			
		}
		if(op == 2) {
			
			re=n1-n2;
			JOptionPane.showMessageDialog(null,"A subtra��o � = "+re);
				
			}
		else {
			
			re = n1 *n2;
			JOptionPane.showMessageDialog(null,"A multiplica��o � = "+re);
			
		
		}
		
	}
			
}
