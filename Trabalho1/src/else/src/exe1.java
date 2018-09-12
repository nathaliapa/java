import javax.swing.JOptionPane;

public class exe1 {
	public static void main(String arg[]) {

		double c;
		double venda;
		venda = Double.parseDouble(JOptionPane.showInputDialog("Valor da venda"));

		if (venda < 1000) {
			c = venda * 0.05;
			JOptionPane.showMessageDialog(null, "Comissão=" + c);
		} else if (venda >= 1000 && venda < 5000) {
			c = venda * 0.10;
			JOptionPane.showMessageDialog(null, "Comissão=" + c);
		} else if (venda >= 5000 && venda <= 10000) {
			c = venda * 0.15;
			JOptionPane.showMessageDialog(null, "Comissão=" + c);
		} else {
			c = venda * 0.20;
			JOptionPane.showMessageDialog(null, "Comissão=" + c);
		}

	}
}
