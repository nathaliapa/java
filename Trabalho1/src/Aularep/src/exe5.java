
import javax.swing.JOptionPane;

public class exe5 {
	public static void main(String arg[]) {
	int cont=1;
    int soma=0;
    int n;
    
    while(cont>0){
      n=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      
      soma=soma+n;
      
      if(n==0){
      cont=cont-1000;
      
      }
      
      cont=cont+1;
    
    }
     
    System.out.println("Soma é " + soma);

}
}