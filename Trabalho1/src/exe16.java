import javax.swing.JOptionPane;

public class exe16 {
	
	public static void main(String arg[]) {
		
		double q;
		String c;
		c=JOptionPane.showInputDialog("Codigo do Produto | preço unitario \r\n"+
								       "       1001       |    5.32     \n"+
									   "       1324       |    6.45     \n"+
									   "       6548       |    2.37     \n"+
									   "        987       |    5.32     \n"+
									   "       7623       |    6.45     \r\n "+
									   "Digite o codigo do produto");
		q=Double.parseDouble(JOptionPane.showInputDialog("Digite a qauntidade comprada"));
		double re;
		
		if(c.equals(1001)) {
			re=q*5.32;
			JOptionPane.showMessageDialog(null,"O preço total é="+re);
		}
		else if(c.equals(1324)) {
			re=q*6.45;
			JOptionPane.showMessageDialog(null,"O preço total é="+re);
		}
		else if(c.equals(6548)) {
			re=q*2.37;
			JOptionPane.showMessageDialog(null,"O preço total é="+re);
		}
		else if(c.equals(987)) {
			re=q*5.32;			
			JOptionPane.showMessageDialog(null,"O preço total é="+re);
		}
		else {
			re=q*6.45;
			JOptionPane.showMessageDialog(null,"O preço total é="+re);
		}
		
		
	}

}
