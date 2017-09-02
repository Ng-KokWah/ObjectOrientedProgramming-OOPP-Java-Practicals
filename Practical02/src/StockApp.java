import java.text.DecimalFormat;
public class StockApp {
	public static void main(String[] args) {
		DecimalFormat f = new DecimalFormat("0.000");
		String msg="";
		double diff;
		double percentChange;
		Stock s = new Stock("ORCL", "ORACLECORPORATION", 34.50, 34.35);
		double opening = s.getOpeningPrice();
		double current = s.getCurrentPrice();
		diff = current - opening;
		percentChange = (diff / opening) * 100;
		if(percentChange < 0){
			msg = "drop";
			System.out.println("A "+msg+" of "+f.format((percentChange * (double)-1))+" percent");
		}
		else {
			msg = "rise";
			System.out.println("A "+msg+" of "+f.format(percentChange)+"percent");
		}
	}
}
