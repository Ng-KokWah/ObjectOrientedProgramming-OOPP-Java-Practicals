
public class Message
{
	private String sender;
	private String recipient;
	private String message="";
	
	public Message(){}
	public Message(String sender,String recipient)
	{
		this.sender=sender;
		this.recipient=recipient;
	}
	public void append(String text)
	{
		this.message+="\n";
		this.message+=text;
	}
	public String toString()
	{
		return("From: "+sender+"\nTo: "+recipient+message);
	}
}
