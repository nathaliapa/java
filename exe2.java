import javax.swing.JOptionPane;

public class exe2 {
  
	public static void main(String arg[]) {
		
		double dt,cg;
		double res; 
		
		dt = Double.parseDouble(JOptionPane.showInputDialog("Digite a distancia percorida:"));
		cg = Double.parseDouble(JOptionPane.showInputDialog("Digite o combustivel gasto"));
		
		res =dt/cg;
		
		JOptionPane.showMessageDialog(null,"O consumo é:"+res);
		
	}
}
