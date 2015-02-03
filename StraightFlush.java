/**
 * a singleton class to keep track of straight flush cards
 * that are shown to all users on the game board
 */

import java.util.ArrayList;


public class StraightFlush {

	private static StraightFlush instance = null;
	private ArrayList<Hand> flushlist;

	
	public StraightFlush(){
		flushlist= new ArrayList<Hand>();
	}
	
	public void addHand(Hand c){
		flushlist.add(c);
	}
	
	public void setStaightFlush(Card c){
		Suit cs = c.getSuit();
		Rank cr = c.getRank();
		
		ArrayList<Rank> firstRank = new ArrayList<Rank>();
		ArrayList<Rank> lastRank = new ArrayList<Rank>();
		ArrayList<Suit> suitlist = new ArrayList<Suit>();
		
		for(int i = 0; i < flushlist.size(); i++){
			Hand temp = flushlist.get(i);
			firstRank.add(temp.getFirstRank());
			lastRank.add(temp.getLastRank());
			suitlist.add(temp.getSuit());
		}
		
		for(int j = 0; j< flushlist.size(); j++){
			if(firstRank.get(j).compareTo(cr) == 1
					|| lastRank.get(j).compareTo(cr) == -1){
				if(suitlist.get(j).compareTo(cs) == 0){
					flushlist.get(j).addCard(c);
					flushlist.get(j).sortHand();
				}
			}
		}
	}
	
	public static StraightFlush getInstance()
	{
		if(instance == null)
			instance = new StraightFlush();
		return instance;
	}
}