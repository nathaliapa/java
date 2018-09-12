import javax.swing.JOptionPane;

public class exe17 {
	
	public static void main(String arg[]) {
		
		double cf,pf;
		double im,pd;
		cf = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo de fabrica"));
		im=cf*0.45;
		pd=cf*0.28;
		pf=cf+im+pd;
		
		JOptionPane.showMessageDialog(null,"O preço final é="+pf);
		
				
		
	}

}
