import javax.swing.JOptionPane;

// este programa usa variavel que armazena texto 
//
public class teste2 {

	public static void main(String arg[]){
		
		String nome;
		String endereco;
		String telefone;
		String cpf;
		String cidade;
		String estado;
		
		nome = JOptionPane.showInputDialog("Digite seu nome");
		endereco = JOptionPane.showInputDialog("Digite seu endereço");
		telefone = JOptionPane.showInputDialog("Digite seu telefone");
		cpf = JOptionPane.showInputDialog("Digite seu cpf");
		cidade = JOptionPane.showInputDialog("Digite sua cidade");
		estado = JOptionPane.showInputDialog("Digite seu estado");
		
		
		System.out.println("nome:" +nome);
		System.out.println("endereço:" +endereco);
		System.out.println("Telefone:" + telefone);
		System.out.println("CPF:" +cpf);
		System.out.println("Cidade:" +cidade);
		System.out.println("Estado:" +estado);
		
		
	}
}
