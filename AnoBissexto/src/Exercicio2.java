import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Descubra se ano � bissesxto ou n�o!!!");
	System.out.println("Digite o ano desejado: ");

	int ano;
	ano = s.nextInt();	 
	
	if ((ano % 4 == 0) && (ano % 100 == 0) &&(ano % 400 == 0)) {
		System.out.println("O ano � bissexto!");
	}else 
		System.out.println("O ano n�o � bissexto!");
		s.close();
	}		
}
