import javax.swing.JOptionPane;

public class exe11 {

	public static void main(String arg[]) {

		String senha;
		senha = JOptionPane.showInputDialog("Digite a senha");

		if (senha.equals("493849")) {
			JOptionPane.showMessageDialog(null, "“Bem-Vindo ao Sistema”");
		} else {
			JOptionPane.showMessageDialog(null, "“Acesso Negado”");
		}

	}

}
