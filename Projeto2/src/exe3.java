import javax.swing.JOptionPane;

public class exe3 {

	public static void main(String arg[]) {
		
		String nome;
		nome=JOptionPane.showInputDialog("Digite seu nome:");
		double salario;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario"));
		double tv;
		tv = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu total de vendas"));
		
		double sf,c;
		c= tv*0.15;
		sf = c+salario;
		
		JOptionPane.showMessageDialog(null,"Funcionario:"+nome );
		JOptionPane.showMessageDialog(null,"Salario fixo:"+salario );
		JOptionPane.showMessageDialog(null,"O salario final é:" +sf );
		
		
	}
}
