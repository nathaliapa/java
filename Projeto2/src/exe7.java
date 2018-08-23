import javax.swing.JOptionPane;

public class exe7 {
 
	public static void main(String arg[]) {
		
		double vp,vpre;
		int parcela = 10;
		
		vp=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
		
		vpre = vp / parcela;
		
		JOptionPane.showMessageDialog(null,"O valor de cada parcela é de: "+vpre+"R$");
		
	}
}
