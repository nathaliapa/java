import javax.swing.JOptionPane;

public class exe4 {
	
	public static void main(String arg[]) {
		
		int cont=1;
	    int maior=0;
	    int n;
	    
	    while(cont<=10){
	     n=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
	      
	      if(n>100){
	          maior=maior+1;
	        }
	      cont=cont+1;  
	    }
	     System.out.println("Tem "+ maior + "maiores que 100"
	             + "");
		
		
	}

}
