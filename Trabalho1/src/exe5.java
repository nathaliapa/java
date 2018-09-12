import javax.swing.JOptionPane;

public class exe5 {
	public static void main(String arg[]) {
		
		double a,p;
		double imc;
		
		a=Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
	    p=Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
	    
	    imc = p/(a*a);
	    
	    JOptionPane.showMessageDialog(null,"Seu imc é = " + imc);
	    
		
	}

}
