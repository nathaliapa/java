import javax.swing.JOptionPane;

public class exe9 {

	public static void main(String arg[]) {

		double real, cotacao, dolar;
		dolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a qauntidade de dolar"));

		cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação"));

		real = dolar * cotacao;

		JOptionPane.showMessageDialog(null, "Valor em real=" + real);

	}
}
