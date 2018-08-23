import javax.swing.JOptionPane;

public class exe2 {
 
	 public static void main(String arg[]) {
		 
		 double salario; 
		 double adicional;
		 double desconto;
		 double salarioliq;
		 
		 salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
		 adicional= Double.parseDouble(JOptionPane.showInputDialog("Digite o adicional"));
		 desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o desconto"));
		 
		 salarioliq = salario + adicional - desconto;
		 
		 System.out.println("Salario liquido é: " + salarioliq);
		 
		 
	 }
}
