import javax.swing.JOptionPane;

public class exe26e {
	
	public static void main(String arg[]) {
		
		String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
		int p,a = 0,e = 0;
		
		
		for(int n=1;n>0;n++) {
			
			a1=JOptionPane.showInputDialog("1-De quem � a famosa frase �Penso, logo existo�?\r\n" + 
					"\r\n" + 
					"a) Plat�o\r\n" + 
					"b) Galileu Galilei\r\n" + 
					"c) Descartes\r\n" + 
					"d) S�crates\r\n" + 
					"e) Francis Bacon"+
					"\r\n");
			a2=JOptionPane.showInputDialog("2-De onde � a inven��o do chuveiro el�trico?\r\n" + 
					"\r\n" + 
					"a) Fran�a\r\n" + 
					"b) Inglaterra\r\n" + 
					"c) Brasil\r\n" + 
					"d) Austr�lia\r\n" + 
					"e) It�lia"+
					"\r\n");
			a3=JOptionPane.showInputDialog("Quais o menor e o maior pa�s do mundo?\r\n" + 
					"\r\n" + 
					"a) Vaticano e R�ssia\r\n" + 
					"b) Nauru e China\r\n" + 
					"c) M�naco e Canad�\r\n" + 
					"d) Malta e Estados Unidos\r\n" + 
					"e) S�o Marino e �ndia"+
					"\r\n");
			a4=JOptionPane.showInputDialog("Qual o nome do presidente do Brasil que ficou conhecido como Jango?\r\n" + 
					"\r\n" + 
					"a) J�nio Quadros\r\n" + 
					"b) Jacinto Anjos\r\n" + 
					"c) Get�lio Vargas\r\n" + 
					"d) Jo�o Figueiredo\r\n" + 
					"e) Jo�o Goulart"+
					"\r\n");
			a5=JOptionPane.showInputDialog("Quantas casas decimais tem o n�mero pi?\r\n" + 
					"\r\n" + 
					"a) Duas\r\n" + 
					"b) Centenas\r\n" + 
					"c) Trilhares\r\n" + 
					"d) Vinte\r\n" + 
					"e) Milhares"+
					"\r\n");
			a6=JOptionPane.showInputDialog("Atualmente, quantos elementos qu�micos a tabela peri�dica possui?\r\n" + 
					"\r\n" + 
					"a) 113\r\n" + 
					"b) 109\r\n" + 
					"c) 108\r\n" + 
					"d) 118\r\n" + 
					"e) 92"+
					"\r\n");
			a7=JOptionPane.showInputDialog("O que a palavra legend significa em portugu�s?\r\n" + 
					"\r\n" + 
					"a) Legenda\r\n" + 
					"b) Conto\r\n" + 
					"c) Hist�ria\r\n" + 
					"d) Lenda\r\n" + 
					"e) Legend�rio"+
					"\r\n");
			a8=JOptionPane.showInputDialog("Qual o n�mero m�nimo de jogadores numa partida de futebol?\r\n" + 
					"\r\n" + 
					"a) 8\r\n" + 
					"b) 10\r\n" + 
					"c) 9\r\n" + 
					"d) 5\r\n" + 
					"e) 7"+
					"\r\n");
			a9=JOptionPane.showInputDialog("Quem pintou \"Guernica\"?\r\n" + 
					"\r\n" + 
					"a) Paul C�zanne\r\n" + 
					"b) Pablo Picasso\r\n" + 
					"c) Diego Rivera\r\n" + 
					"d) Tarsila do Amaral\r\n" + 
					"e) Salvador Dal�"+
					"\r\n");
			a10=JOptionPane.showInputDialog("Qual a nacionalidade de Che Guevara?\r\n" + 
					"\r\n" + 
					"a) Cubana\r\n" + 
					"b) Peruana\r\n" + 
					"c) Panamenha\r\n" + 
					"d) Boliviana\r\n" + 
					"e) Argentina"+
					"\r\n");
			
		// em rela��o das perguntas coom  as respostas
			
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
		
		//definir se o la�o continua ou para
		
		n=Integer.parseInt(JOptionPane.showInputDialog("Deja jogar novamento:"+"\n"+"1-SIM"+"\n"+"2-N�o"+"\n"));
		if(n==2) {
			n=n-100;
			break;
		}else {
			n=1+n;
		}
					
		}//for
		
	}

}
