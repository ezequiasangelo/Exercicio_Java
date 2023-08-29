package execicio_juliana;

import java.util.Scanner;

public class at4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite sua nota: ");

			double nota1 = scanner.nextDouble();

			System.out.println("Digite sua segunda nota  ");

			double nota2 = scanner.nextDouble();

			double media = (nota1 + nota2) / 2;

			if( media >= 6){

				System.out.println("Sua Média " + "\n"  + media  + "    Aprovado");

			}else {
				System.out.println("Sua Média " + "\n" + media + "    Reprovado");
			}
		}

		

		
	}

}
