import javax.swing.JOptionPane;

public class exe8 {
	
	public static void main(String arg[]) {
		
		double pc;
		pc=Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de fabrica do carro"));
		double im,lu;
		im=pc*0.45;
		lu=im*0.12;
		double pf;
		pf=pc+im+lu;
		
		JOptionPane.showMessageDialog(null, "Imposto R$="+im+"\n"+"lucro do distribuidor R$="+lu+"\n"+"Custo final do consumidor R$="+pf);
	}

}
