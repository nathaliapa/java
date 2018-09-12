import javax.swing.JOptionPane;

public class exe15 {

	public static void main(String arg[]) {

		double s, rs;
		s = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu saldo medio"));

		if (s <= 200) {
			JOptionPane.showMessageDialog(null, "Nenhum credito");
		}
		else if (s > 201 && s <= 400) {
			rs = s * 0.20;
			JOptionPane.showMessageDialog(null, "20% do valor do saldo medio=" + rs);

		}
		else if (s > 401 && s <= 600) {
			rs = s * 0.30;
			JOptionPane.showMessageDialog(null, "30% do valor do saldo medio=" + rs);
		}
		else {
			rs = s * 0.40;
			JOptionPane.showMessageDialog(null, "40% do valor do saldo medio=" + rs);
		}

	}

}
