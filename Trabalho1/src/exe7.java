import javax.swing.JOptionPane;

public class exe7 {
	
	public static void main(String arg[]) {
		
		Double j,f,m,mv;
		j=Double.parseDouble(JOptionPane.showInputDialog("Digite a media de venda de Janeiro"));
		f=Double.parseDouble(JOptionPane.showInputDialog("Digite a media de venda de Fevereiro"));
		m=Double.parseDouble(JOptionPane.showInputDialog("Digite a media de venda de Março"));
		
		mv=(j+f+m)/3;
		
		JOptionPane.showMessageDialog(null, "A media de venda dos meses de Janeiro, Fevereiro e Março = " + mv);
		
	}

}
