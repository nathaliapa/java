import javax.swing.JOptionPane;

public class exe1 {
	
	public static void main(String arg[]) {
		
		int teste;
		teste =Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do mes"));
		
		switch(teste) {
		case 1:
			JOptionPane.showMessageDialog(null,"Janeiro");
			break;
		case 2:
			JOptionPane.showMessageDialog(null,"Fevereiro");
			break;
			
		}
		
	}

}
