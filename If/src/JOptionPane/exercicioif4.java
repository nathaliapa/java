package JOptionPane;

import javax.swing.JOptionPane;

public class exercicioif4 {

	public static void main(String arg[]) {
		
		int n1,n2;
		
		n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero "));
		
		if(n1==4 && n2==8) {
			JOptionPane.showMessageDialog(null,"Ufa! Bomba desarmada");
		}else {
			JOptionPane.showMessageDialog(null,"BBBBOOOOOOOOOMMMMMM");
		}
		
	}
	
}
