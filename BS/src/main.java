
public class main
{
	public static void main(String[] args)
	{
		Deck deck = new Deck();
		Card[] cards = deck.getDeck();
		Deck.shuffle(cards);
		System.out.println(deck.toString());
	}
}
