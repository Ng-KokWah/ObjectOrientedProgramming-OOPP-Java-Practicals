
public class Stock
{
	private String symbol;
	private String name;
	private double openingPrice;
	private double currentPrice;
	
	public Stock(String symbol, String name, double openingPrice) {
		super();
		this.symbol = symbol;
		this.name = name;
		this.openingPrice = openingPrice;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getOpeningPrice() {
		return openingPrice;
	}

	public void setOpeningPrice(double openingPrice) {
		this.openingPrice = openingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public double calPercentChange(){
		double change = (currentPrice - openingPrice);
		return change/openingPrice * 100;
	}
	
}