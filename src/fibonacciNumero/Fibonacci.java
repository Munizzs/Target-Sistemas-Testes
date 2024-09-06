package fibonacciNumero;

public class Fibonacci {
    private int numero;

    public Fibonacci(int numero) {
        this.numero = numero;
    }

    public boolean ehFibonacci(){
        int numeroAtual = 1, ultimoNumero = 0;
        while(numeroAtual<=this.numero){
            int temporario = numeroAtual;
            numeroAtual = ultimoNumero + numeroAtual;
            ultimoNumero = temporario;

            if(numeroAtual == this.numero){
                return true;
            }
        }
        return false;
    }
}
