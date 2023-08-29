package execicio_juliana;

import java.util.Scanner;

public class bt10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Digite um salario: ");
		 
		 double salario = scanner.nextDouble();
		 
		 System.out.print("Digite os valores das vendas: ");
		 
		 double vendas =  scanner.nextDouble();
		 
		 double porcentagem;
		 
		 if(vendas <= 1500) { 
			 porcentagem = vendas * 0.03;
		 }else {
			 porcentagem = 1500 * 0.03 + (vendas - 1500) * 0.05;
		 }
		 
		 double salarioTotal = salario + porcentagem;
		 
		 System.out.println("Salario total é: " + salarioTotal );
			
		 scanner.close();
	}
	
}