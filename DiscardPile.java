/**
 * a singleton class to keep track of the discard pile
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;


public class DiscardPile implements Serializable{
	private static DiscardPile instance = null;
	private ArrayList<Card> cards = null;
	
	public DiscardPile(){
		cards = new ArrayList<Card>();
	}
	
	public void addCard(Card c){
		cards.add(c);
	}
	
	public int getSize(){
		return cards.size();
	}
	
	public Card getTopCard(){
		if(cards.size() == 0){
			return null;
		}
		return cards.remove(cards.size()-1);
	}
	
	public Card getSecTopCard(){
		if(cards.size() <= 1){
			return null;
		}
		return cards.get(cards.size()-2);
	}
	
	
	public ArrayList<Card> toCardPile(){
		ArrayList<Card> cardlist = new ArrayList<Card>();
		cardlist.addAll(cards);
		Card topcard = cardlist.remove(cards.size()-1);
		cards.clear();
		this.addCard(topcard);
		Collections.shuffle(cardlist);
		return cardlist;
	}
	
	
	
	public static DiscardPile getInstance(){
		if(instance == null){
			instance = new DiscardPile();
		}
		return instance;
	}
}
