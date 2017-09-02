
public class MessageApp
{
	public static void main(String[]args)
	{
		Message mail = new Message("Harry Morgan","Rudolf Reindeer");
		mail.append("...");
		mail.append("Hello, how are you?");
		mail.append("How about dinner tonight?");
		mail.append("...");
		System.out.print(mail.toString());
	}
}
