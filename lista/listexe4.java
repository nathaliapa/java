package lista;

import javax.swing.JOptionPane;

public class listexe4 {
	
public static void main(String arg[]) {
		
		
		double salario;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario"));
		double tv;
		tv = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu total de vendas"));
		
		double sf,c;
		c= tv*0.15;
		sf = c+salario;
		
		if(salario>sf) {
			JOptionPane.showMessageDialog(null, "Seu salario � = " + salario);
			JOptionPane.showMessageDialog(null, "Seu salario final � = "+sf);
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� foi bastante eficiente nas vendas este m�s");
		}
		else {
			
			JOptionPane.showMessageDialog(null, "Seu salario � = " + salario);
			JOptionPane.showMessageDialog(null, "Seu salario final � = "+sf);
			JOptionPane.showMessageDialog(null,"Voc� nao foi bastante eficiente nas vendas este m�s");
		}
		
		
	}

}
