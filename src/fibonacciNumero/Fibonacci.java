package fibonacciNumero;

public class Fibonacci {
    private int numero;

    public Fibonacci(int numero) {
        this.numero = numero;
    }

    public boolean ehFibonacci(){
        if (numero == 0 || numero == 1) {
            return true;
        }

        int numeroAtual = 1, ultimoNumero = 0;

        while(numeroAtual<=this.numero){
            if(numeroAtual == this.numero){
                return true;
            }
            int temporario = numeroAtual;
            numeroAtual = ultimoNumero + numeroAtual;
            ultimoNumero = temporario;
        }
        return false;
    }

    @Override
    public String toString() {
        return "O numero "+numero;
    }
}
