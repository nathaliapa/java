import javax.swing.JOptionPane;

public class idade {

		public static void main(String arg[]) {
			
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		if (idade > 17) {
			JOptionPane.showMessageDialog(null, "Você é maior de idade");
		} else {
			JOptionPane.showMessageDialog(null, "Você é menor de idade");
		}
			
			
			
		}
}
