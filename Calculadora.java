/**
 *Programa que faz calculos.
 */ 

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora{

      public static void main(String[] args){
	     
		 /* Recebe valores do usuario  */
		 Scanner s = new Scanner(System.in);//Entrada de valores.
		 boolean continua = true;
		 
		 do{
		 try{
		 System.out.println("Digite o primeiro numero");
		 int primeiroNumero = s.nextInt();//Recebe primeiro valor numerico.
		 System.out.println("Digite o segundo numero");
		 int segundoNumero = s.nextInt();//Recebe segundo valor numerico.
		 System.out.println("Digite o operador");
		 String operador = s.next();//Recebe um operador.
		 
		 /* Calcula valores recebidos pelo usuario  */
		 
		 switch(operador){
		 
		    case "+":
			  System.out.println(primeiroNumero + segundoNumero);//Imprime a soma dos valores.
		    break;
			
			case "-":
			  System.out.println(primeiroNumero - segundoNumero);//Imprime a subtração dos valores.
			break;
			
			case "*":
			  System.out.println(primeiroNumero * segundoNumero);//Imprime a multiplicação dos valores.
			break;
			
			case "/":
			  System.out.println(primeiroNumero / segundoNumero);//Imprime a divisão dos valores.
			break;
		 }
		    continua = false;
		 }//fim do try
		  catch (InputMismatchException erro1) {
                System.err.println("O numero deve ser inteiro");
                s.nextLine();
            } 
            catch (ArithmeticException erro2) {
                System.err.println("O divisor deve ser maior que zero");
            }
		 }//fim do do
		 while(continua);
	  
	  }

}