import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		
		System.out.println("Descubra se seu Triangulo é Equilatero,Isóceles ou Escaleno!");
		System.out.println("Digite o primeiro lado do triangulo:");
			float n1 = s.nextFloat();
		System.out.println("Digite o segundo lado do triangulo:");
			float n2 = s.nextFloat();
		System.out.println("Digite o terceiro lado do triangulo:");
			float n3 = s.nextFloat();
		
		System.out.println(verificarTriangulo( n1, n2, n3));
		
		s.close();
		
		}
		private static String verificarTriangulo(float n1, float n2, float n3) {
			
			if ( n1 == n2 && n1 == n3) {
			return "O triangulo é Equilatero";
			
		}else if(n1 != n2 && n1 != n3 && n2 != n3) {
			return "O triangulo é Escaleno";
		}else{
			return "O triangulo é Isóceles";
		}
		}
	}

