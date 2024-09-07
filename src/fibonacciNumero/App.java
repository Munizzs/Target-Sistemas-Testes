package fibonacciNumero;

import java.util.Scanner;

/*2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.*/

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = sc.nextInt();

        Fibonacci fibonacci = new Fibonacci(numero);

        if(fibonacci.ehFibonacci()){
            System.out.println(fibonacci+" pertence à sequência de Fibonacci.");
        }else{
            System.out.println(fibonacci+" não pertence à sequência de Fibonacci.");
        }
    }
}
