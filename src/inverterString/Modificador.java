package inverterString;

import java.util.ArrayList;

public class Modificador {
    private String palavra;

    public Modificador(String palavra) {
        this.palavra = palavra;
    }

    public ArrayList <Character> inverter(){
        ArrayList<Character> caracteres = new ArrayList<>(this.palavra.length());

        for(int i=0;i<this.palavra.length();i++){
            caracteres.add(this.palavra.charAt(this.palavra.length()-i-1));
        }
        return caracteres;
    }
}
