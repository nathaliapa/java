import javax.swing.JOptionPane;

public class exe12 {
	
	public static void main(String arg[]) {
		
		int n, q;
		double resultado;
		n=Integer.parseInt(JOptionPane.showInputDialog("\r\n"+
				                                              "codigo do lanches |   Especifica��o  | Pre�o unitario\r\n"+
													   "       100                     | Cachoro quente |        1.50     \n"+
													   "       101                     |  Bauru Simples  |        2.00     \n"+
													   "       102                     |  Bauru c/ovo       |        2.30     \n"+
													   "       103                     |  Hamb�rger        |        2.00     \n"+
													   "       104                     |  Cheesburguer  |        2.40     \n"+
													   "       105                     |  Refrigerante      |       1.50    \r\n"+"\r\n"+
													   "Digite o numero do pedido:"));
		
		q = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));

		if (n == 100) {

			resultado = q * 1.5;
			JOptionPane.showMessageDialog(null, "O valor a pagar pelo cachorro quente � = " + resultado);

		}
		if (n == 101) {

			resultado = q * 2;
			JOptionPane.showMessageDialog(null, "O valor a pagar pelo bauru simples � = " + resultado);

		}
		if (n == 102) {

			resultado = q * 2.3;
			JOptionPane.showMessageDialog(null, "O valor a pagar pelo bauru c/ ovo � = " + resultado);

		}
		if (n == 103) {

			resultado = q * 2;
			JOptionPane.showMessageDialog(null, "O valor a pagar pelo hamb�rguer � = " + resultado);

		}
		if (n == 104) {

			resultado = q * 2.4;
			JOptionPane.showMessageDialog(null, "O valor a pagar pelo cheeseburger � = " + resultado);

		}
		if (n == 105) {

			resultado = q * 1.5;
			JOptionPane.showMessageDialog(null, "O valor a pagar pelo refrigerante � = " + resultado);
		}

	}

}
