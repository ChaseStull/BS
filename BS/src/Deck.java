public class Deck
{
	private Card[] deck;

	public Deck()
	{
		this.deck = new Card[52];
		int c = 0;
		for(int i = 0; i <= 3; i++)
		{
			for(int j = 1; j <= 13; j++)
			{
				deck[c] = new Card(j, i);
				c++;
			}
		}
	}

	public Card[] getDeck()
	{
		return deck;
	}

	public static void shuffle(Card[] deck)
	{
		for(int i = 0; i < 52; i++)
		{
			for(int j = 0; j < 52; j++)
			{
				System.out.println(swap(deck, (int)(Math.random()*52), (int)(Math.random()*52)));
			}
		}
	}

	public static String swap(Card [] deck, int index1, int index2)
	{
		Card card1 = deck[index1];
		deck[index1] = deck[index2];
		deck[index2] = card1;

		return "Cards " + (index1 + 1) + " and " + (index2 + 1) + " were swapped";
	}

	public String toString()
	{
		String l1 = "";
		String l2 = "";
		String l3 = "";
		String l4 = "";
		String l5 = "";
		String l6 = "";
		String l7 = "";
		String l8 = "";
		String l9 = "";
		for(int i = 0; i < 52; i++)
		{
			l1 += " ------ ";
			l2 += "|      |";
			l8 += "|      |";
			l9 += " ------ ";
		}

		for(int i = 0; i < 52; i++)
		{
			switch(deck[i].getValue())
			{

			
			switch(deck[i].getSuit())
			{
			case 0 : 
			}
		}
		return l1;
	}

	public static void deal(Deck deck, int players)
	{

	}

	/*public boolean compareTo(Card one, Card two)
	{
		return (one.getSuit() == two.getSuit()) && (one.getValue() == two.getValue());
	}*/
}
