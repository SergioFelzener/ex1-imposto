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
		
		
		double salarioIrpf = salarioBruto - descontoInss;
		
		Irpf irpf = new Irpf(salarioIrpf);
		double descontoIrpf = irpf.calcularDesconto();
		System.out.println("Desconto IRPF " + descontoIrpf);
		
		
		System.out.println("Desconto Total : " + (descontoIrpf + descontoInss));
		
		
		salarioLiquido = salarioIrpf - descontoIrpf;
		System.out.println("Salario Liquido: " + salarioLiquido);
	}

}
