/**
 * a singleton class to keep track of cards of the same
 * value that is shown to all users
 */

import java.util.ArrayList;


public class AllKind {

	private static AllKind instance = null;
	private ArrayList<Hand> allkindlist;

	
	public AllKind(){
		allkindlist= new ArrayList<Hand>();
	}
	
	public void addHand(Hand c){
		allkindlist.add(c);
	}
	
	public void setAllKind(Card c){

		Rank cr = c.getRank();
		
		ArrayList<Rank> firstRank = new ArrayList<Rank>();
		
		for(int i = 0; i < allkindlist.size(); i++){
			Hand temp = allkindlist.get(i);
			firstRank.add(temp.getFirstRank());
		}
		
		for(int j = 0; j< allkindlist.size(); j++){
			if(firstRank.get(j).compareTo(cr) == 0){
				allkindlist.get(j).addCard(c);
				allkindlist.get(j).sortHand();				
			}
		}
	}
	
	public static AllKind getInstance()
	{
		if(instance == null)
			instance = new AllKind();
		return instance;
	}
}
