package execicio_juliana;

import java.util.Scanner;

public class at3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12.");
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas maçãs você vai comprar?   ");
        int quantidade = scanner.nextInt();

        double valor;

        if (quantidade < 12) {
            valor = quantidade * 1.30;
        } else {
            valor = quantidade * 1.00;
        }

        System.out.println("Custo total é R$ " + valor);

        scanner.close();
		
	}

}
