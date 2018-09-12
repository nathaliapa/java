import javax.swing.JOptionPane;

public class exe20 {
	
	public static void main(String arg[]) {
		
		int idade;
		idade=Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		
		if(idade<18 || idade>70) {
			JOptionPane.showMessageDialog(null,"Imposivel Seguro");
		}
		if(idade>=18 || idade<=24) {
			JOptionPane.showMessageDialog(null,"Grupo de rico: Baixo");
		}
		if(idade>=25 || idade<=40) {
			JOptionPane.showMessageDialog(null, "Grupo de rico: Medio");
		}
		if(idade>=41 || idade<=70) {
			JOptionPane.showMessageDialog(null, "Grupo de risco: Alto");
		}
		
	}

}
