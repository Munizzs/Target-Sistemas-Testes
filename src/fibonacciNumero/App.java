package fibonacciNumero;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = sc.nextInt();

        Fibonacci fibonacci = new Fibonacci(numero);

        if(fibonacci.ehFibonacci()){
            System.out.println("O numero "+numero+" é um Fibonacci");
        }else{
            System.out.println("O numero "+numero+" não é um Fibonacci");
        }
    }
}
