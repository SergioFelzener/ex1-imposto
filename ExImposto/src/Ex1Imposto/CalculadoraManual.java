package Ex1Imposto;

import java.util.Scanner;

public class CalculadoraManual {

	public static void main(String[] args) {
		double salarioLiquido = 0.0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Digite seu salario");
		double salarioBruto = Double.parseDouble(keyboard.nextLine());
		
		// Implemente aqui
		Inss inss = new Inss(salarioBruto);
		double descontoInss = inss.calcularDesconto();
		
		System.out.println("Desconto INSS " + descontoInss);
		salarioLiquido = salarioBruto - descontoInss;
		
		System.out.println("Salario Liquido: " + salarioLiquido);
	}

}
