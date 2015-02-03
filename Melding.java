import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 * a class created to evaluate and sort the cards added to the melding pane
 * 
 */

public class Melding implements Serializable{

	private ArrayList<Card> tempList;
	
	public Melding(){
		tempList = new ArrayList<Card>();
	}
	
	public void addCard(Card c){
		tempList.add(c);
	}
	/**
	 * evaluateMelding cards
	 * return 0-- illegal melding
	 * return 1-- All the cards in the same kind
	 * return 2-- All the cards in the same suit and rank in sequence
	 * @return
	 */
	public int evaluateMelding(){
		int eva = 0;
		this.sort();
		if(tempList.size() >= 3){
			ArrayList<Rank> newRankList = new ArrayList<Rank>();
			ArrayList<Suit> newSuitList = new ArrayList<Suit>();
			for(int i = 0; i< tempList.size(); i++)
			{
				newRankList.add(tempList.get(i).getRank());
				newSuitList.add(tempList.get(i).getSuit());
			}
			
			if(Collections.frequency(newRankList, tempList.get(0).getRank()) == tempList.size())
				eva = 1;  //same kind
			else{
				int tempFreq = 0;
				for(int i = 0; i < tempList.size(); i++){
					tempFreq = Collections.frequency(newRankList, tempList.get(i).getRank());
				}
				if(tempFreq == 1){
					int lastindex = tempList.size()-1;
					//flush and same suits
					if(tempList.get(0).getRank().compareTo(tempList.get(lastindex).getRank())+1 == tempList.size()
							&& Collections.frequency(newSuitList, tempList.get(0).getSuit()) == tempList.size())
						eva = 2;
				}
			}
				
		}
		
		return eva;
			
	}
	
	private void sort()
	{
		//build a new array list and deleting one maxCard element from the handlist to the new list
		//sort the the hand according the the rank and the suit sort only for the neat
		ArrayList<Card> newHandList = new ArrayList<Card>();
		Card maxCard;
		while (tempList.size() > 0)
		{
			maxCard = tempList.get(0);
			for(int i = 1; i < tempList.size(); i++)
			{
				if(tempList.get(i).getRank().compareTo(maxCard.getRank()) > 0 
						|| tempList.get(i).getRank().compareTo(maxCard.getRank()) == 0 
						&& tempList.get(i).getSuit().compareTo(maxCard.getSuit()) > 0)
				{
					maxCard = tempList.get(i);
				}
			} 
				tempList.remove(maxCard);
				newHandList.add(maxCard);
		}
		tempList = newHandList;
	}
}
