import java.math.BigDecimal;

enum Operazione {
    ADDIZIONE("+"), SOTTRAZIONE("-"), MOLTIPLICAZIONE("*"), DIVISIONE("/"), MIN("min"), MAX("max");

    private final String simbolo;

    Operazione(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
}

public class eee{

    public static void main(String[] args) {
        BigDecimal numero1 = new BigDecimal("10.5");
        BigDecimal numero2 = new BigDecimal("5.2");

        for (Operazione1 operazione : Operazione1.values()) {
            BigDecimal risultato = calcolaOperazione(numero1, numero2, operazione);
            System.out.println("Operazione: " + operazione.getSimbolo());
            System.out.println("Numero 1: " + numero1);
            System.out.println("Numero 2: " + numero2);
            System.out.println("Risultato: " + risultato);
            System.out.println();
        }
    }

    private static BigDecimal calcolaOperazione(BigDecimal num1, BigDecimal num2, Operazione1 operazione) {
        switch (operazione) {
            case ADDIZIONE:
                return num1.add(num2);
            case SOTTRAZIONE:
                return num1.subtract(num2);
            case MOLTIPLICAZIONE:
                return num1.multiply(num2);
            case DIVISIONE:
                if (num2.compareTo(BigDecimal.ZERO) != 0) {
                    return num1.divide(num2, 2, BigDecimal.ROUND_HALF_UP);
                } else {
                    System.out.println("Errore: divisione per zero");
                    return BigDecimal.ZERO;
                }
            case MIN:
                return num1.min(num2);
            case MAX:
                return num1.max(num2);
            default:
                throw new IllegalArgumentException("Operazione non supportata: " + operazione.getSimbolo());
        }
    }
}