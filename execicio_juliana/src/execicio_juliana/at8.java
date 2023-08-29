package execicio_juliana;

import java.util.Scanner;

public class at8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hora de inicio do jogo:  ");

		int inicio = scanner.nextInt();

		System.out.println("Hora do fim de jogo:  ");

		int fim = scanner.nextInt();

		int duracao;

		if(fim <= inicio ) {

			duracao = 24 - inicio + fim;

		}else {

			duracao = fim - inicio;

			System.out.println("Duração do jogo:  "  + duracao + "hrs");

			scanner.close();
		}

	}

}
