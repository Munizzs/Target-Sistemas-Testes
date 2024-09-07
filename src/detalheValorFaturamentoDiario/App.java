package detalheValorFaturamentoDiario;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        Dados dados = new Dados();

        Faturamento[] faturamentos = lerFaturamentos("src/detalheValorFaturamentoDiario/dados.json");

        if (faturamentos != null) {
            double menorValor = dados.calcularMenorFaturamento(faturamentos);
            double maiorValor = dados.calcularMaiorFaturamento(faturamentos);
            double mediaMensal = dados.calcularMediaMensal(faturamentos);
            int diasAcimaDaMedia = dados.calcularDiasAcimaDaMedia(faturamentos, mediaMensal);

            System.out.printf("Menor valor de faturamento: %.2f\n", menorValor);
            System.out.printf("Maior valor de faturamento: %.2f\n", maiorValor);
            System.out.printf("Número de dias com faturamento acima da média: %.2f", diasAcimaDaMedia);
        }
    }

    public static Faturamento[] lerFaturamentos(String caminhoArquivo) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(caminhoArquivo)) {
            return gson.fromJson(reader, Faturamento[].class);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return null;
        }
    }
}
