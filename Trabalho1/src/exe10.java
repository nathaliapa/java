import javax.swing.JOptionPane;

public class exe10 {

	public static void main(String arg[]) {

		double real, cotacao, dolar;
		dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a qauntidade de dolar"));

		cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cota��o"));

		real = dolar * cotacao;

		if (real > 600) {

			JOptionPane.showMessageDialog(null, "Valor em real=" + real + "\n" + "�Pagar� imposto de importa��o�,");
		} else {
			JOptionPane.showMessageDialog(null, "Valor em real=" + real);
		}

	}

}
