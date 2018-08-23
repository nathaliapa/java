import javax.swing.JOptionPane;

public class exemplof1 {
	
	public static void main(String arg[]) {
		
		int numero;
		
		numero=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		if(numero >100) {
		
			JOptionPane.showMessageDialog(null,"o numero digitado e maior que 100");
		}
		if(numero < 100) {
		
			JOptionPane.showMessageDialog(null,"o numero digitado é menor que 100");
		}
		else {
			
			JOptionPane.showMessageDialog(null,"o numero digitado é 100");
		
		}
				
	}

}
