package Aplicacao;

import java.util.Scanner;

import entedidade.Utilitarios;

public class Programa {

	public static void main(String[] args) {
		
		
		
		double n1, n2, resultado;
       System.out.print("Digite o primeiro n�mero = ");
       Scanner leia = new Scanner (System.in);
       n1 = leia.nextDouble();
       System.out.print("Digite o segundo n�mero =");
       n2 = leia.nextDouble();
       Utilitarios result = new Utilitarios();
       resultado = result.soma(n1, n2);
       System.out.println("A soma  � = " + resultado);
       resultado = result.subtracao(n1, n2);
       System.out.println("A subtra��o � = " + resultado);
       resultado = result.multiplicacao(n1, n2);
       System.out.println("A multiplica��o �  = " + resultado);
       resultado =result.divisao(n1, n2);
       System.out.println("A divis�o �  = " + resultado);
       resultado = result.raizquadrada(n1, n2);
       System.out.println("A raiz quadrada � = " + resultado);
       resultado = result.potencia(n1, n2);
       System.out.println("A potencia � = " + resultado);
       if(n1+n2%2==0) {
    	   System.out.println("� par e � divisivel ");
       }
       else if(n1+n2%3==0) {
    	   System.out.println("� impa e � divisivel por 3 ");
       }
       else {
    	   System.out.println("� impar e n�o � divisivel ");
       }
       
       
       
       
       
       
       leia.close();
	}

}
