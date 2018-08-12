import javax.swing.JOptionPane;


public class exe2 { 
	
	public static void main(String arg[]){
		
		double salario;
		double adicional;
		double salarioliq;
	
		salario = Integer.parseDouble(JOpitionPane.showInputDialog("Digite o salario"));
		adicional = Integer.parseDouble(JOpitionPane.showInputDialog("Digite o adicional noturno"));
		
		salarioliq = salario + adicional;
		
		System.out.println("Salario:" + salarioliq);
	}

}
