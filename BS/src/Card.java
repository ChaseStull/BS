public class Card
{
	private int value;
	private String name;
	private int suit;
	
	public Card(int value, int suit)
	{
		this.value = value;
		this.suit = suit;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getSuit()
	{
		return suit;
	}
}
