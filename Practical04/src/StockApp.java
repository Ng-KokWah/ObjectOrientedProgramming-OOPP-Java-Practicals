import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
public class StockApp
{
	static Scanner sc = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("0.###");
	public static void main(String[]args)
	{
		String symbol;
		String name;
		double openingPrice;
		double currentPrice;
		ArrayList<Stock>stocks=new ArrayList<Stock>();
		do{
			System.out.print("Enter symbol: ");
			symbol=sc.nextLine();
			if(!symbol.toLowerCase().equals("quit")){
			System.out.print("Enter name: ");
			name=sc.nextLine();
			System.out.print("Enter opening price (S$): ");
			openingPrice=sc.nextDouble();
			System.out.print("Enter market price (S$): ");
			currentPrice=sc.nextDouble();
			sc.nextLine();
			Stock stock = new Stock(symbol, name, openingPrice);
			stock.setCurrentPrice(currentPrice);
			stocks.add(stock);
			System.out.print("\n");
			}
		}while(!symbol.toLowerCase().equals("quit"));
		System.out.print("\n");
		for(int i=0;i<stocks.size();i++)
		{
			System.out.println(stocks.get(i).getSymbol()+","+stocks.get(i).getName());
			double change = stocks.get(i).calPercentChange();
			if(change<0)
			{
				change*=-1;
				System.out.println("A drop of "+df.format(change)+" percent");
			}
			else
			{
				System.out.println("An increase of "+df.format(change)+" percent");
			}
		}
		System.out.print("Good Bye!");
	}
}
