package faturamentoMensalDistribuidora;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Calculos calculos = new Calculos();

        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        double totalFaturamento = calculos.calcularTotalFaturamento(faturamentoPorEstado);

        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            String estado = entry.getKey();
            double faturamento = entry.getValue();
            double percentual = calculos.calcularPercentual(faturamento, totalFaturamento);
            System.out.printf("Percentual de %s: %.2f%%%n", estado, percentual);
        }
    }
}
