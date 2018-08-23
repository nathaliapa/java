import javax.swing.JOptionPane;

public class exe1 {

  public static void main(String arg[]) {
	  
	  int num;
	  int num2;
	  int soma;
	  
	  num = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
	  num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
	  
	  soma = num + num2;
	  
	  System.out.println("A soma é: " + soma);
	  
  }
}
