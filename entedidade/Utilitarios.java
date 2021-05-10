package entedidade;

public class Utilitarios {
	public double soma (double n1, double n2) {
		double resultado;
		resultado = n1 + n2;
		return resultado;
	}
	
	public double subtracao (double n1, double n2) {
		double resultado;
		resultado = n1 - n2;
		return resultado;
	}
	public double multiplicacao (double n1, double n2) {
		double resultado;
		resultado = n1 * n2;
		return resultado;
	}
	public double divisao (double n1, double n2) {
		double resultado;
		resultado = n1 / n2;
		return resultado;
	}
	public double raizquadrada (double n1, double n2) {
		double resultado;
		resultado = Math.sqrt(n1 * n2);
		return resultado;
	}
	public double potencia (double n1, double n2) {
		double resultado;
		resultado = Math.pow(n1 , n2);
		return resultado;
	}
	
}
