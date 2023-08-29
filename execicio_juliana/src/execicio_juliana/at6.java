package execicio_juliana;

import java.util.Scanner;

public class at6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Escreva um valor:  ");

			int valor1 = scanner.nextInt();

			System.out.println("Escreva um segundo valar:  ");

			int valor2 = scanner.nextInt();

			int valorMaior;

			if( valor1 > valor2) {

				valorMaior = valor1;

			}else {
				valorMaior = valor2;
			}

			System.out.println("Valor maior é:  " + valorMaior);
		}
	}

}
