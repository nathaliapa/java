import javax.swing.JOptionPane;

public class exe26e {
	
	public static void main(String arg[]) {
		
		String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
		int p,a = 0,e = 0;
		
		
		for(int n=1;n>0;n++) {
			
			a1=JOptionPane.showInputDialog("1-De quem é a famosa frase “Penso, logo existo”?\r\n" + 
					"\r\n" + 
					"a) Platão\r\n" + 
					"b) Galileu Galilei\r\n" + 
					"c) Descartes\r\n" + 
					"d) Sócrates\r\n" + 
					"e) Francis Bacon"+
					"\r\n");
			a2=JOptionPane.showInputDialog("2-De onde é a invenção do chuveiro elétrico?\r\n" + 
					"\r\n" + 
					"a) França\r\n" + 
					"b) Inglaterra\r\n" + 
					"c) Brasil\r\n" + 
					"d) Austrália\r\n" + 
					"e) Itália"+
					"\r\n");
			a3=JOptionPane.showInputDialog("Quais o menor e o maior país do mundo?\r\n" + 
					"\r\n" + 
					"a) Vaticano e Rússia\r\n" + 
					"b) Nauru e China\r\n" + 
					"c) Mônaco e Canadá\r\n" + 
					"d) Malta e Estados Unidos\r\n" + 
					"e) São Marino e Índia"+
					"\r\n");
			a4=JOptionPane.showInputDialog("Qual o nome do presidente do Brasil que ficou conhecido como Jango?\r\n" + 
					"\r\n" + 
					"a) Jânio Quadros\r\n" + 
					"b) Jacinto Anjos\r\n" + 
					"c) Getúlio Vargas\r\n" + 
					"d) João Figueiredo\r\n" + 
					"e) João Goulart"+
					"\r\n");
			a5=JOptionPane.showInputDialog("Quantas casas decimais tem o número pi?\r\n" + 
					"\r\n" + 
					"a) Duas\r\n" + 
					"b) Centenas\r\n" + 
					"c) Trilhares\r\n" + 
					"d) Vinte\r\n" + 
					"e) Milhares"+
					"\r\n");
			a6=JOptionPane.showInputDialog("Atualmente, quantos elementos químicos a tabela periódica possui?\r\n" + 
					"\r\n" + 
					"a) 113\r\n" + 
					"b) 109\r\n" + 
					"c) 108\r\n" + 
					"d) 118\r\n" + 
					"e) 92"+
					"\r\n");
			a7=JOptionPane.showInputDialog("O que a palavra legend significa em português?\r\n" + 
					"\r\n" + 
					"a) Legenda\r\n" + 
					"b) Conto\r\n" + 
					"c) História\r\n" + 
					"d) Lenda\r\n" + 
					"e) Legendário"+
					"\r\n");
			a8=JOptionPane.showInputDialog("Qual o número mínimo de jogadores numa partida de futebol?\r\n" + 
					"\r\n" + 
					"a) 8\r\n" + 
					"b) 10\r\n" + 
					"c) 9\r\n" + 
					"d) 5\r\n" + 
					"e) 7"+
					"\r\n");
			a9=JOptionPane.showInputDialog("Quem pintou \"Guernica\"?\r\n" + 
					"\r\n" + 
					"a) Paul Cézanne\r\n" + 
					"b) Pablo Picasso\r\n" + 
					"c) Diego Rivera\r\n" + 
					"d) Tarsila do Amaral\r\n" + 
					"e) Salvador Dalí"+
					"\r\n");
			a10=JOptionPane.showInputDialog("Qual a nacionalidade de Che Guevara?\r\n" + 
					"\r\n" + 
					"a) Cubana\r\n" + 
					"b) Peruana\r\n" + 
					"c) Panamenha\r\n" + 
					"d) Boliviana\r\n" + 
					"e) Argentina"+
					"\r\n");
			
		// em relação das perguntas coom  as respostas
			
		if(a1.equals("c")) {
			a=1;
			p=1;
			
		}else {
			e=1;
			p=0;
		}
		if(a2.equals("c")) {
			a=a+1;
			p=p+1;
			
		}else {
			e=e+1;
			p=p+0;
		}
		if(a3.equals("a")) {
			a=a+1;
			p=p+1;
			
		}else {
			e=e+1;
			p=p+0;
		}
		if(a4.equals("e")) {
			a=a+1;
			p=p+1;
			
		}else {
			e=e+1;
			p=p+0;
		}
		if(a5.equals("c")) {
			a=a+1;
			p=p+1;
			
		}else {
			e=e+1;
			p=p+0;
		}
		if(a6.equals("d")) {
			a=a+1;
			p=p+1;
			
		}else {
			e=e+1;
			p=p+0;
		}
		if(a7.equals("d")) {
			a=a+1;
			p=p+1;
			
		}else {
			e=e+1;
			p=p+0;
		}
		if(a8.equals("e")) {
			a=a+1;
			p=p+1;
			
		}else {
			e=e+1;
			p=p+0;
		}
		if(a9.equals("b")) {
			a=a+1;
			p=p+1;
			
		}else {
			e=e+1;
			p=p+0;
		}
		if(a10.equals("e")) {
			a=a+1;
			p=p+1;
			
		}else {
			e=e+1;
			p=p+0;
		}//final do if
		
		
		JOptionPane.showMessageDialog(null,"Acertos = "+a+"\n"+"Erros = "+e+"\n"+"Pontos = "+p);
		
		//definir se o laço continua ou para
		
		n=Integer.parseInt(JOptionPane.showInputDialog("Deja jogar novamento:"+"\n"+"1-SIM"+"\n"+"2-NÃo"+"\n"));
		if(n==2) {
			n=n-100;
			break;
		}else {
			n=1+n;
		}
					
		}//for
		
	}

}
