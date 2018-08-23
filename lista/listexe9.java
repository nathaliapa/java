package lista;

import javax.swing.JOptionPane;

public class listexe9 {

public static void main(String arg[]) {
		
		double deposito,juros,rendimento;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));
		juros = (deposito * 0.70)/100;
		rendimento = juros + deposito;
		
		JOptionPane.showMessageDialog(null,"O rendimento da poupansa no mes foi ="+rendimento);
		
		
	}
}
