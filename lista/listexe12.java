package lista;

import javax.swing.JOptionPane;

public class listexe12 {

public static void main(String arg[]){
		
		double re;
		double q;
		q=Double.parseDouble(JOptionPane.showInputDialog("digite a quantidade"));
		double vp;
		vp=Double.parseDouble(JOptionPane.showInputDialog("digite o valor do produto"));
		double csd;
		csd=vp*q;
		
		if(q<=100){
			JOptionPane.showMessageDialog(null, "nenhum desconto ="+csd);
		}
		
		if(q>100 && q<200){
			
			re = 0.05*csd;
			JOptionPane.showMessageDialog(null,"5% de desconto ="+re);
			
			}else{
			
			re = 0.10*csd;
			JOptionPane.showMessageDialog(null,"10% de desconto ="+re);
		}
		
	}
	
}
