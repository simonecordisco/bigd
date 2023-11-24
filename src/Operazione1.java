public enum Operazione1 {
    ADDIZIONE("+"),
    SOTTRAZIONE("-"),
    MOLTIPLICAZIONE("*"),
    DIVISIONE("/"),

    MAX("MAX"),

    MIN("MIN"),
    ;
    private String simbolo;

    void Operazione(String simbolo) {
        this.simbolo = simbolo;
    }

    Operazione1(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
    }