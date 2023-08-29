package execicio_juliana;

import java.util.Scanner;

public class at5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Me informe que ano é:  ");
			
			int ano = scanner.nextInt();
			
			System.out.println("Que ano você nasceu?  ");
			
			int nascimento = scanner.nextInt();
			
			int idade = ano - nascimento ;
			
			
			if( idade > 16){
				System.out.println("Pode votar!  ");
			}else {
				System.out.println("Não pode votar!  ");
				
			}
		}
		
		
	}

}
