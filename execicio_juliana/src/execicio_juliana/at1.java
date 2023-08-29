package execicio_juliana;

import java.util.Scanner;

public class at1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva um numero:   ");
		
		int valor = scanner.nextInt();
		
		 if (valor > 10) {
	            System.out.println("É MAIOR QUE 10!");
	        } else {
	            System.out.println("NÃO É MAIOR QUE 10!");
	        }
	        
	        scanner.close();
	    
		
	}

}
