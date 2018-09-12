import javax.swing.JOptionPane;

public class exe {
	
	public static void main(String arg[]) {
		
		double q;
		double c;
		c=Double.parseDouble(JOptionPane.showInputDialog("Digite o codigo do produto"));
		
		q=Double.parseDouble(JOptionPane.showInputDialog("Digite a qauntidade comprada"));
		double re;
		
		if(c==1001) {
			re=q*5.32;
			JOptionPane.showMessageDialog(null,"O preço total é="+re);
		}
		else if(c==1324) {
			re=q*6.45;
			JOptionPane.showMessageDialog(null,"O preço total é="+re);
		}
		else if(c==6548) {
			re=q*2.37;
			JOptionPane.showMessageDialog(null,"O preço total é="+re);
		}
		else if(c==987) {
			re=q*5.32;			
			JOptionPane.showMessageDialog(null,"O preço total é="+re);
		}
		else {
			re=q*6.45;
			JOptionPane.showMessageDialog(null,"O preço total é="+re);
		}
		
		
	}

}
