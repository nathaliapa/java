import javax.swing.JOptionPane;

public class aula1 {

	public static void main(String arg[]) {
		
		double peso,altura,imc;
		String p, a;
		
		p= JOptionPane.showInputDialog("Digite o peso");
	    peso= Double.parseDouble(p);
	    
	    a=JOptionPane.showInputDialog("Digite a altura");
	    altura=Double.parseDouble(a);
	    
	    imc = peso / (altura * altura);
	    		
	   System.out.println("O imc é:" + imc );
	    
	    
		
	}
}
