import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int resp = 0;
		
		
		System.out.println("Responda as perguntas a seguir para saber seu nivel da participa��o no crime!");
		System.out.println("Digite 1 = Sim e 2 = N�o");	
		System.out.println("Voc� telefonou para a v�tima? ");	
		if (s.nextInt() == 1) { 
			++resp;		
		}
		System.out.println("Voc� esteve no local do crime? ");
		if (s.nextInt() == 1 ) {
			++resp;			
		}
		System.out.println("Mora perto da v�tima?");	
		if (s.nextInt() == 1) { 
			++resp;		
		}
		System.out.println("Devia para a v�tima?");
		if (s.nextInt() == 1 ) {
			++resp;			
		}System.out.println("J� trabalhou com a v�tima?");	
		if (s.nextInt() == 1) { 
			++resp;		
		}
		
		if(resp == 2) {
			System.out.println("Voc� � suspeito");
		}else if(resp == 3 || resp == 4 ){ 
			System.out.println("Voc� � c�mplice");			
		}else if(resp == 5 ){ 
			System.out.println("Voc� � o Assasino");
		}else {
			System.out.println("Voc� � inocente");
		}	
	}
}


