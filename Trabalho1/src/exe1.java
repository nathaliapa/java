import javax.swing.JOptionPane;

public class exe1 {

	public static void main(String arg[]) {

		int idade, an, aa;

		an = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento "));
		aa = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));

		idade = aa - an;

		JOptionPane.showMessageDialog(null, "Sua idade é:" + idade);

	}
}
