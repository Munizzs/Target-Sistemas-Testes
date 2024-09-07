package faturamentoMensalDistribuidora;

import java.util.Map;

public class Calculos {
    public double calcularTotalFaturamento(Map<String, Double> faturamentoPorEstado) {
        double total = 0;
        for (double valor : faturamentoPorEstado.values()) {
            total += valor;
        }
        return total;
    }

    public double calcularPercentual(double valor, double total) {
        return (valor / total) * 100;
    }
}
