package detalheValorFaturamentoDiario;

public class Dados {
    public static double calcularMenorFaturamento(Faturamento[] faturamentos) {
        double menorValor = Double.MAX_VALUE;
        for (Faturamento faturamento : faturamentos) {
            if (faturamento.getValor() > 0 && faturamento.getValor() < menorValor) {
                menorValor = faturamento.getValor();
            }
        }
        return menorValor;
    }

    public static double calcularMaiorFaturamento(Faturamento[] faturamentos) {
        double maiorValor = Double.MIN_VALUE;
        for (Faturamento faturamento : faturamentos) {
            if (faturamento.getValor() > 0 && faturamento.getValor() > maiorValor) {
                maiorValor = faturamento.getValor();
            }
        }
        return maiorValor;
    }

    public static double calcularMediaMensal(Faturamento[] faturamentos) {
        double somaValores = 0;
        int diasComFaturamento = 0;
        for (Faturamento faturamento : faturamentos) {
            if (faturamento.getValor() > 0) {
                somaValores += faturamento.getValor();
                diasComFaturamento++;
            }
        }
        return diasComFaturamento > 0 ? somaValores / diasComFaturamento : 0;
    }

    public static int calcularDiasAcimaDaMedia(Faturamento[] faturamentos, double mediaMensal) {
        int diasAcimaDaMedia = 0;
        for (Faturamento faturamento : faturamentos) {
            if (faturamento.getValor() > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }
        return diasAcimaDaMedia;
    }

}
