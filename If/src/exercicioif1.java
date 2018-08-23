import javax.swing.JOptionPane;

public class exercicioif1 {
 
	public static void main(String arg[]) {
		
		int idade;
		
		idade=Integer.parseInt(JOptionPane.showInputDialog("digite sua idade"));
		
		if(idade>18) {
			JOptionPane.showMessageDialog(null, "Maior de idade");
		}
		if(idade<18) {
			JOptionPane.showMessageDialog(null, "Menor de idade");
		}
		else {
			JOptionPane.showMessageDialog(null, "Você tem 18 entao é maior de idade");
		}
		
	}
}
