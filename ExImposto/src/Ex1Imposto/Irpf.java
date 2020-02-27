package Ex1Imposto;

public class Irpf {
	private double salarioInss;
	
	public Irpf(double salarioInss) {
		this.salarioInss = salarioInss;
		
	}
	
	public double calcularDesconto () {
		if (salarioInss <= 1903.98) {
			return 0;
		} else if (salarioInss <= 2826.65) {
			return (this.salarioInss * 0.075) - 142.80 ;
		} else if (salarioInss <= 3751.05) {
			return (this.salarioInss * 0.15) - 354.80;
		} else if (salarioInss <= 4664.68) {
			return (this.salarioInss * 0.225) - 636.13;
		} else  {
			return (this.salarioInss * 0.275 ) - 869.36;
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
