package lista;

import javax.swing.JOptionPane;

public class listexe10 {
 
	public static void main(String arg[]) {
		
		double vp,vpre;
		int parcela = 5;
		double salario;
		double p;
		
		salario=Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do cliente"));
		vp=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
		
		vpre = vp / parcela;
		p = salario * 0.35;
		
		if(p<vpre) {
			JOptionPane.showMessageDialog(null,"Pode não ser interessante realizar a compra, você vai comprometer muito o seu salário");
		}else {
			JOptionPane.showMessageDialog(null,"O valor de cada parcela é de R$ "+vpre);
		}
	}
}
