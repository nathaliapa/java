package lista;

import javax.swing.JOptionPane;

public class listexe5 {
	
	public static void main(String arg[]) {
		
	
	double n1,n2,n3;
	String nome;
	double media;
	
	nome=JOptionPane.showInputDialog("Digite seu nome");
	n1=Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
	n2=Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
	n3=Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
	
	media = (n1+n2+n3)/3;
	
	JOptionPane.showMessageDialog(null,"O aluno(a) " + nome + "Tem media = " +media);
	
	}
}
