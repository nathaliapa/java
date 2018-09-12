import javax.swing.JOptionPane;

public class exe6 {
	
	public static void main(String arg[]) {
		
		double d,c,r;
		d=Double.parseDouble(JOptionPane.showInputDialog("Digite a distancia percorida"));
	    c=Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de combustivel gasto"));
	    
	    r=d/c;
	    
	    JOptionPane.showMessageDialog(null,"o carro fez = " + r);
		
	}

}
