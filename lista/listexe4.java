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
			JOptionPane.showMessageDialog(null, "Seu salario é = " + salario);
			JOptionPane.showMessageDialog(null, "Seu salario final é = "+sf);
			JOptionPane.showMessageDialog(null, "Parabéns, você foi bastante eficiente nas vendas este mês");
		}
		else {
			
			JOptionPane.showMessageDialog(null, "Seu salario é = " + salario);
			JOptionPane.showMessageDialog(null, "Seu salario final é = "+sf);
			JOptionPane.showMessageDialog(null,"Você nao foi bastante eficiente nas vendas este mês");
		}
		
		
	}

}
