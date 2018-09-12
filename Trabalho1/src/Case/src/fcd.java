import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class fcd {
	
	public static void main(String arg[]) {
		
		double media;
		double p1,p2,p3;
		p1=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a primeira nota", "Media", 1));
		p2=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a segunda nota", "Media", 1));
		p3=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a terceira nota", "Media", 1));
		media=(p1+p2+p3)/3;
		
		if(media>6) {
			DecimalFormat df = new DecimalFormat("##.##");
		JOptionPane.showMessageDialog(null, "Aprovado "+"\n"+"sua media é = " +  df.format(media), "Media", 3);
		}else {
			DecimalFormat df = new DecimalFormat("##.##");
			JOptionPane.showMessageDialog(null, "Reprovado "+"\n"+"sua media é = " + df.format(media), "Media", 0);
		}
		
	}

}
