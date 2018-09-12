import javax.swing.JOptionPane;


public class exe21 {

	public static void main(String arg[]) {
		
		double salario;
		double e;
		salario=Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario"));
		
		if(salario<1878) {
			JOptionPane.showMessageDialog(null,"“ISENTO”");	
		}
		if(salario>=1878 && salario<2456) {
			e=salario*0.10;
			JOptionPane.showMessageDialog(null,"10% de imposto"+"\n"+"Salario atual="+salario+"\n"+"Salario com imposto="+e);	
		}
		if(salario >=2456 && salario<5100 ) {
			e=salario*0.20;
			JOptionPane.showMessageDialog(null,"20% de imposto"+"\n"+"Salario atual="+salario+"\n"+"Salario com imposto="+e);
	    }
	    if(salario>=5100) {
			e=salario*0.30;
			JOptionPane.showMessageDialog(null,"30% de imposto"+"\n"+"Salario atual="+salario+"\n"+"Salario com imposto="+e);
	    }
	    
	 
	}
}
