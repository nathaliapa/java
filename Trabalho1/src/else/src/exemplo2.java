import javax.swing.JOptionPane;

public class exemplo2 {

	public static void main(String arg[]) {

		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));

		if (idade < 12) {
			JOptionPane.showMessageDialog(null, "Voc� � crian�a");
		} else if (idade < 18) {
			JOptionPane.showMessageDialog(null, "Voc� � adolecente");
		} else {
			JOptionPane.showMessageDialog(null, "Voc� � adulto");
		}

	}

}
