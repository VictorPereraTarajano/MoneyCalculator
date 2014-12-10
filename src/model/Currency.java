package model;

public class Currency {
    
    private final String name, symbol, code;
    
    public Currency(String name, String symbol, String code) {
        this.name = name;
        this.symbol = symbol;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getCode() {
        return code;
    }
    
    @Override
    public String toString () {
        return this.symbol;
    }
       
}
