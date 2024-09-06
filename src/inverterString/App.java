package inverterString;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = sc.nextLine();

        Modificador modificador = new Modificador(palavra);

        for(int i=0; i<modificador.inverter().size();i++){
            System.out.print(modificador.inverter().get(i));
        }
    }
}
