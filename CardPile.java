/**
 * a singleton class to keep track of the card pile
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;

public class CardPile implements Serializable{ 
	private static CardPile instance = null;
	private ArrayList<Card> cards = null;
	//How many card is deal from CardPile
	private int index; 
	
	/*set card according to its' rank and suit
	 * rankList will give the list of rank in each suit, from Two to Ace
	 * suitList will give the list of suit, from Clubs to Spades
	 * Initially, no card deal from CardPile
	 * and the cardpile is shuffled which is easier for the game setting
	 */
	public CardPile()
	{
		cards = new ArrayList<Card>();
		List<Suit> suitList = Suit.getUnmodifiable();
		List<Rank> rankList = Rank.getUnmodifiable();
		
		int x = 0;
		for(int i = 0; i < 4; i++) //suitList index range
		{
			for(int j = 0; j < 13; j++) // rankList index range
			{
				Card cardin = new Card(rankList.get(j), suitList.get(i), new ImageIcon(suitList.get(i).toString()+rankList.get(j).toString()+".png"));
				cards.add(x, cardin);
				x++;
			}
		}
		index = 0; 
		Collections.shuffle(cards);
	}
	
	public static CardPile getInstance()
	{
		if(instance == null)
			instance = new CardPile();
		return instance;
	}
	
	//get the size of card pile
	public int sizeOfCardpiles()
	{
		return cards.size();
	}
	
	//cards remains in CardPile
	public int sizeOfCardRemain()
	{
		return cards.size() - index;
	}
	
	//deal one card from CardPile, the index number will increase one
	public Card dealcard()
	{
			return cards.remove(index);	
	}		
	
	public Hand dealcards(int num){
		Hand h = new Hand();
		for(int i = 0; i < num; i++){
			h.addCard(dealcard());
		}
		return h;
	}
	
	public void setCardPile(ArrayList<Card> cardslist){
		if(cards.size() == 0){
			cards.addAll(cardslist);
		}
	}
	//shuffle cardpile by use collections submethod
	public void shuffle()
	{
		Collections.shuffle(cards);
	}

}
