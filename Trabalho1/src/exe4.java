import javax.swing.JOptionPane;

public class exe4 {
	
	public static void main(String arg[]) {
		
		double n,p,re;
		
		n=Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
	    p=Double.parseDouble(JOptionPane.showInputDialog("Digite uma porcentagem"));
	    re=n*(p/100);
	    
	    JOptionPane.showMessageDialog(null,"o valor referente à porcentagem do número digitado ="+re);
	    
	}

}
