package execicio_juliana;

import java.util.Scanner;

public class at2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite um valor:   ");
			
			int valor = scanner.nextInt();
			
			if(valor >= 0) {
				
				System.out.println("Positivo");
				
			}else {
				System.out.println("Negativo");
			}
		}

	}

}
