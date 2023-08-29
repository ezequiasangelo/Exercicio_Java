package execicio_juliana;

import java.util.Scanner;

public class at9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

	        final int horasSemanais = 40;
	        final int semanasPorMes = 4;

	        System.out.print("Digite o numero de horas trabalhadas no mês: ");
	        int horasTrabalhadas = scanner.nextInt();

	        System.out.print("Digite o salário por hora: ");
	        double salarioPorHora = scanner.nextDouble();

	        double salarioTotal;

	        if (horasTrabalhadas > horasSemanais * semanasPorMes) {
	            int horasExtras = horasTrabalhadas - (horasSemanais * semanasPorMes);
	            double valorHoraExtra = salarioPorHora * 1.5; // Acréscimo de 50% na hora extra
	            double salarioHoraExtra = horasExtras * valorHoraExtra;
	            salarioTotal = (horasSemanais * semanasPorMes * salarioPorHora) + salarioHoraExtra;
	        } else {
	            salarioTotal = horasTrabalhadas * salarioPorHora;
	        }

	        System.out.println("O salário total do funcionário é: R$ " + salarioTotal);

	        scanner.close();
	
	}

}
