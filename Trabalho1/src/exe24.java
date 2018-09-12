import javax.swing.JOptionPane;

public class exe24 {

	public static void main(String arg[]) {
		
		double pc,r;
		double lucro;
		String br;
		
		pc=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da carga"));
		br=JOptionPane.showInputDialog("Digite a BR");
		
				
		if(br.equals("23")) {
			if(pc<=1000) {
				r=pc*2.00;
				lucro=r-100;
				JOptionPane.showMessageDialog(null,"O Total de lucro é R$ =" + lucro);
			}}
		if(br.equals("23")) {
			if(pc>1000) {
				JOptionPane.showMessageDialog(null,"Peso Excedente");
			}}
		
		if(br.equals("25")) {
			if(pc<=2200) {
				r=pc*2.00;
				lucro=r-500-200;
				JOptionPane.showMessageDialog(null,"O Total de lucro é R$ =" + lucro);
			}}
		if(br.equals("25")) {
			if(pc>2200) {
				JOptionPane.showMessageDialog(null,"Peso Excedente");
			}}
				
			
		
	}
	
}
    