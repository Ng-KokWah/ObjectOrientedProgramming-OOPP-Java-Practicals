
public class Stock {
	private String symbol;
	private String name;
	private double openingPrice;
	private double currentPrice;
	
	public Stock(String symbol, String name, double openingPrice, double currentPrice) {
		this.symbol = symbol;
		this.name = name;
		this.openingPrice = openingPrice;
		this.currentPrice = currentPrice;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setOpeningPrice(double openingPrice) {
		this.openingPrice = openingPrice;
	}
	
	public double getOpeningPrice() {
		return openingPrice;
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public double getCurrentPrice() {
		return currentPrice;
	}
}
