import javax.swing.JOptionPane;

public class exe3 {
	
	public static void main(String arg[]) {
		
		int nf,ncf;
		double pc;
		double r,p,pf;
		
		nf = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos anos você fuma"));
		ncf = Integer.parseInt(JOptionPane.showInputDialog("Numero de cigaros fumado por dia"));
		pc= Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da cartela do cigarro"));
		
		r=nf*360;
		p=pc/20;
		pf=r*ncf*p;
		
		JOptionPane.showMessageDialog(null,"O total gasto é R$= " + pf);
				
		
		
		
		
	}

}
