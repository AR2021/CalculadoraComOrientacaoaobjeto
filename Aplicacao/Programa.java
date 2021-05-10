package Aplicacao;

import java.util.Scanner;

import entedidade.Utilitarios;

public class Programa {

	public static void main(String[] args) {
		
		
		
		double n1, n2, resultado;
       System.out.print("Digite o primeiro número = ");
       Scanner leia = new Scanner (System.in);
       n1 = leia.nextDouble();
       System.out.print("Digite o segundo número =");
       n2 = leia.nextDouble();
       Utilitarios result = new Utilitarios();
       resultado = result.soma(n1, n2);
       System.out.println("A soma  é = " + resultado);
       resultado = result.subtracao(n1, n2);
       System.out.println("A subtração é = " + resultado);
       resultado = result.multiplicacao(n1, n2);
       System.out.println("A multiplicação é  = " + resultado);
       resultado =result.divisao(n1, n2);
       System.out.println("A divisão é  = " + resultado);
       resultado = result.raizquadrada(n1, n2);
       System.out.println("A raiz quadrada é = " + resultado);
       resultado = result.potencia(n1, n2);
       System.out.println("A potencia é = " + resultado);
       if(n1+n2%2==0) {
    	   System.out.println("È par e é divisivel ");
       }
       else if(n1+n2%3==0) {
    	   System.out.println("É impa e é divisivel por 3 ");
       }
       else {
    	   System.out.println("É impar e não é divisivel ");
       }
       
       
       
       
       
       
       leia.close();
	}

}
