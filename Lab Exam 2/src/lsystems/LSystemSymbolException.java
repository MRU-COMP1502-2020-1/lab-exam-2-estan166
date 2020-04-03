package lsystems;

public class LSystemSymbolException extends Exception {
	
	private String symbol;
	
	public LSystemSymbolException(String symbol) {
		super(symbol);
		this.symbol = symbol;
	}

	public String getSymbol() {
		return symbol;
	}

}
