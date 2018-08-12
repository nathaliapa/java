import javax.swing.JOptionPane;


public class exe1 {

	public static void main(String arg[]){
		
		int n1;
		int n2;
		int soma;
	    
		
		n1 = Integer.parseInt(JOpitionPane.showInputDialog("Digite o primeiro numero"));
		n2 = Integer.parseInt(JOpitionPane.showInputDialog("Digite o segundo numero"));
		
		soma = n1 + n2;
		
		System.out.println("Soma é :"+ soma);
		
		
	}
}
