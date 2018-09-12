import javax.swing.JOptionPane;

public class exe10 {

	public static void main(String arg[]) {

		double real, cotacao, dolar;
		dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a qauntidade de dolar"));

		cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação"));

		real = dolar * cotacao;

		if (real > 600) {

			JOptionPane.showMessageDialog(null, "Valor em real=" + real + "\n" + "“Pagará imposto de importação”,");
		} else {
			JOptionPane.showMessageDialog(null, "Valor em real=" + real);
		}

	}

}
