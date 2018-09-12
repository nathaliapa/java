import javax.swing.JOptionPane;

public class exe14 {

	public static void main(String arg[]) {

		int an;
		int idade;
		an = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento"));
		idade = 2018 - an;

		if (idade < 12) {
			JOptionPane.showMessageDialog(null, "criança");
		} else if (idade >= 12 && idade <= 17) {
			JOptionPane.showMessageDialog(null, "adolescente");
		} else if (idade > 17 && idade <= 60) {
			JOptionPane.showMessageDialog(null, "adulto");
		} else {
			JOptionPane.showMessageDialog(null, "idoso");
		}

	}

}
