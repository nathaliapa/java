package lista;

import javax.swing.JOptionPane;

public class exe13 {
	
	public static void main(String arg[]){
		
	 int i;
	 
	 i=Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
	 
	 if(i<12){
		 JOptionPane.showMessageDialog(null, "“Categoria Infantil"); 
	 }
	 if(i>17){
		 JOptionPane.showMessageDialog(null, "Categoria Adulto"); 
	 }else{
		JOptionPane.showMessageDialog(null, "Categoria Juvenil"); 
	 }
		
	
	}

}
