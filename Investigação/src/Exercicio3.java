import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int resp = 0;
		
		
		System.out.println("Responda as perguntas a seguir para saber seu nivel da participação no crime!");
		System.out.println("Digite 1 = Sim e 2 = Não");	
		System.out.println("Você telefonou para a vítima? ");	
		if (s.nextInt() == 1) { 
			++resp;		
		}
		System.out.println("Você esteve no local do crime? ");
		if (s.nextInt() == 1 ) {
			++resp;			
		}
		System.out.println("Mora perto da vítima?");	
		if (s.nextInt() == 1) { 
			++resp;		
		}
		System.out.println("Devia para a vítima?");
		if (s.nextInt() == 1 ) {
			++resp;			
		}System.out.println("Já trabalhou com a vítima?");	
		if (s.nextInt() == 1) { 
			++resp;		
		}
		
		if(resp == 2) {
			System.out.println("Você é suspeito");
		}else if(resp == 3 || resp == 4 ){ 
			System.out.println("Você é cúmplice");			
		}else if(resp == 5 ){ 
			System.out.println("Você é o Assasino");
		}else {
			System.out.println("Você é inocente");
		}	
	}
}


