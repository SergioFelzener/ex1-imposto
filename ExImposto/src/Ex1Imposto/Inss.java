package Ex1Imposto;

public class Inss {
	private double salarioBruto;
	
	public Inss(double salarioBruto) {
		this.salarioBruto = salarioBruto;
		
	}
	
	public double calcularDesconto () {
		if(salarioBruto <= 1693.72) {
			return this.salarioBruto * 0.08;
		} else if (salarioBruto <= 2822.90) {
			return this.salarioBruto * 0.09;
		} else if (salarioBruto <= 5645.80) {
			return this.salarioBruto * 0.11;
		} else {
			return 621.04;
		}
	
	}
}
