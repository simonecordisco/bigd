import java.math.BigDecimal;
import java.math.RoundingMode;

//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione, moltiplicazione e
// divisione, min e max) definita in un enum, crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
public class Main {

    public static void main(String[] args) {
         BigDecimal a = new BigDecimal(5.3);
         BigDecimal b = new BigDecimal(4.5);
         BigDecimal totalscale = a.setScale(2,RoundingMode.HALF_EVEN);
         BigDecimal totalscale1 = b.setScale(2,RoundingMode.HALF_EVEN);

         for (Operazione1 operazione : Operazione1.values()) {
          BigDecimal risultato = calcola(a,b,operazione);
            System.out.println("Operazione: " + operazione);
            System.out.println("Numero 1: " + totalscale);
            System.out.println("Numero 2: " + totalscale1);
            System.out.println("Risultato: " + risultato.setScale(2,RoundingMode.HALF_EVEN));
        }
    }
    public static BigDecimal calcola(BigDecimal a, BigDecimal b, Operazione1 operazione) {
        switch (operazione) {
            case ADDIZIONE:
                return a.add(b);
            case SOTTRAZIONE:
                return a.subtract(b);
            case MOLTIPLICAZIONE:
                return a.multiply(b);
            case DIVISIONE:
                return a.divide(b, 2, RoundingMode.HALF_EVEN);
            case MAX:
                return a.max(b);
            case MIN:
                return a.min(b);
            default:
        }
        return a;
    }
    }
