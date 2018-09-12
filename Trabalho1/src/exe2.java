import javax.swing.JOptionPane;

public class exe2 {
	
	public static void main(String arg[]) {
		
		double n1,n2,n3;
		
		n1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
		n2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
		n3=Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro numero"));
		
		double s,d,m;
		
		s=n1+n2+n3;
		m=s*3;
		d=m/n1;
		
		JOptionPane.showMessageDialog(null,"O resulta é:" + d);
	
		
		
	}

}
