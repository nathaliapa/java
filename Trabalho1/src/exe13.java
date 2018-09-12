import javax.swing.JOptionPane;

public class exe13 {

	public static void main(String arg[]) {

		int an;
		int idade;
		an = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento"));
		idade = 2018 - an;

		if (idade < 17) {

			JOptionPane.showMessageDialog(null, "Criança");
		} else {
			JOptionPane.showMessageDialog(null, "Adulto");
		}

	}

}
