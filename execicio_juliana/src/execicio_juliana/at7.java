package execicio_juliana;

import java.util.Scanner;

public class at7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int menorValor = Math.min(valor1, valor2);
        int maiorValor = Math.max(valor1, valor2);

        System.out.println("Valores em ordem crescente: " + menorValor + ",  " + maiorValor);

        scanner.close();
    }
}
