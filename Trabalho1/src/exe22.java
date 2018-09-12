import javax.swing.JOptionPane;

public class exe22 {
public static void main(String arg[]) {
		
		double op;
		double d;
		double t;
		
		op=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do refrigerante"));
		d=Double.parseDouble(JOptionPane.showInputDialog("Digite o Dinheiro"));
		
		if(op==1.00 ) {
			if(d>=1.00) {
				t=d-1.00;
				JOptionPane.showMessageDialog(null,"Seu troco é ="+t);
					}}
		if(op==1.00){
			if(d<1.00) {
				t=1.00-d;
				JOptionPane.showMessageDialog(null,"Falta RS ="+ t + " para pagar o refrigerante");
			}}
		
		if(op==1.50 ) {
			if(d>=1.50) {
				t=d-1.50;
				JOptionPane.showMessageDialog(null,"Seu troco é ="+t);
					}}
		if(op==1.50){
			if(d<1.50) {
				t=1.50-d;
				JOptionPane.showMessageDialog(null,"Falta RS ="+ t + " para pagar o refrigerante");
			}}
		if(op==2.00 ) {
			if(d>=2.00) {
				t=d-2.00;
				JOptionPane.showMessageDialog(null,"Seu troco é ="+t);
					}}
		if(op==2.00){
			if(d<2.00) {
				t=2.00-d;
				JOptionPane.showMessageDialog(null,"Falta RS ="+ t + " para pagar o refrigerante");
			}}
		if(op==2.50 ) {
			if(d>=2.50) {
				t=d-2.50;
				JOptionPane.showMessageDialog(null,"Seu troco é ="+t);
					}}
		if(op==2.50){
			if(d<2.50) {
				t=2.50-d;
				JOptionPane.showMessageDialog(null,"Falta RS ="+ t + " para pagar o refrigerante");
			}}
		if(op==3.00 ) {
			if(d>=3.00) {
				t=d-3.00;
				JOptionPane.showMessageDialog(null,"Seu troco é ="+t);
					}}
		if(op==3.00){
			if(d<3.00) {
				t=3.00-d;
				JOptionPane.showMessageDialog(null,"Falta RS ="+ t + " para pagar o refrigerante");
			}}
		
	
	}

}
