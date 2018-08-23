package JOptionPane;

import javax.swing.JOptionPane;

public class exercicioif2 {

	public static void main(String arg[]) {
		
		double n1,n2,n3,n4;
		double nota;
		
		n1=Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
		n2=Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
		n3=Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
		n4=Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota"));
		
		nota = (n1+n2+n3+n4)/4;
		
		if(nota >=7) {
			JOptionPane.showMessageDialog(null,"Parabens voce passou");
			
		}
		else {
			JOptionPane.showMessageDialog(null,"Voce foi reprovado");
		}
		
		
	}
}
