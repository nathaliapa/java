import javax.swing.JOptionPane;

public class aula2 {

	public static void main(String arg[]) {

	    double num1,num2;
		double soma,sub,mult,div;
		
		num1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
		
		soma=num1+num2;
		sub=num1-num2;
		mult=num1*num2;
		div=num1/num2;
		
		JOptionPane.showMessageDialog(null,"A soma �:"+soma);
		JOptionPane.showMessageDialog(null,"A subitra��o �:"+sub);
		JOptionPane.showMessageDialog(null,"A multiplica��o:"+mult);
		JOptionPane.showMessageDialog(null,"A adivis�o �:"+div);
		
		
		
	}
}
