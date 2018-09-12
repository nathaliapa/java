
import javax.swing.JOptionPane;

public class exe3 {
	
	public static void main(String[] args) {
        
	      int cont=1;
	    int n;
	    n=Integer.parseInt(JOptionPane.showInputDialog("Digite um  numero"));
	    
			while(cont<=n) {
				System.out.println(cont);
				cont=cont+1;
			}
	        
	    }

}
