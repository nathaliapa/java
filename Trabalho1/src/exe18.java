import javax.swing.JOptionPane;

public class exe18 {

	public static void main(String arg[]) {
		
		String cargo1;
		double salario;
		double cargo;
		double sr;
		salario=Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario"));
		cargo1 = JOptionPane.showInputDialog("Digite seu cargo");
		cargo=Double.parseDouble(JOptionPane.showInputDialog("Digite o codigo do seu cargo:\r\n"+"\r\n"+
															  "101 - Gerente\r\n"+
															  "102 - Engenheiro\r\n"+
															  "103 - Tecnico\r\n"+
															  "104 - Outros cargos"));
		
		if(cargo==101) {
			sr=salario*0.10;
			JOptionPane.showMessageDialog(null,"O gerente recebera 10% "+"\n "+ "Salario antigo R$="+salario+"\n"+"Salario novo R$="+sr);
		}
		if(cargo==102) {
			sr=salario*0.20;
			JOptionPane.showMessageDialog(null,"O Engenehiro recebera 20% "+"\n "+ "Salario antigo R$="+salario+"\n"+"Salario novo R$="+sr);
		}
		if(cargo==103) {
			sr=salario*0.30;
			JOptionPane.showMessageDialog(null,"O Tecnico recebera 30% "+"\n "+ "Salario antigo R$="+salario+"\n"+"Salario novo R$="+sr);
		}
		if(cargo==104) {
			sr=salario*0.40;
			JOptionPane.showMessageDialog(null,"O" + cargo1 +" recebera 40% "+"\n "+ "Salario antigo R$="+salario+"\n"+"Salario novo R$="+sr);
		}
	}
}
