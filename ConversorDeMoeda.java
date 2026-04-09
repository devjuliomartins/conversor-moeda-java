package aulas.aula3;

public class ConversorDeMoeda {

    public double converter(double valor, String de, String para, boolean clienteVip) {

        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para conversão.");
        }

        // mesma moeda n converte
        if (de.equalsIgnoreCase(para)) {
            return valor;
        }

        double taxa = 0;

        //Taxas de cambio
        if (de.equalsIgnoreCase("USD") && para.equalsIgnoreCase("BRL")) {
            taxa = 5.0;
        } else if (de.equalsIgnoreCase("BRL") && para.equalsIgnoreCase("USD")) {
            taxa = 0.20;
        } else if (de.equalsIgnoreCase("EUR") && para.equalsIgnoreCase("BRL")) {
            taxa = 6.0;
        } else if (de.equalsIgnoreCase("BRL") && para.equalsIgnoreCase("EUR")) {
            taxa = 0.17;
        } else if (de.equalsIgnoreCase("JPY") && para.equalsIgnoreCase("BRL")) {
            taxa = 0.035;
        } else if (de.equalsIgnoreCase("BRL") && para.equalsIgnoreCase("JPY")) {
            taxa = 28.5;
        } else {
            throw new IllegalArgumentException("Conversões não suportado: " + de + para);
        }

        double convertido = valor * taxa;

        // Aplica desconto para conversão entre duas moedas estrangeiras.
        if (!de.equalsIgnoreCase("BRL") && !para.equalsIgnoreCase("BRL")) {
            convertido *= 0.989;
        }

        if (clienteVip) {
            convertido *= 0.995;
        }

        if (convertido > 10000) {
            convertido *= 0.94;
        }

        return convertido;
    }
}

