import java.io.Serializable;
import java.util.ArrayList;

public class Hand implements Serializable{
	//build a array list for the hand class
	private ArrayList<Card> handList;
	private String command = null;
	private String username = null;
	private String message = null;
	private String ipaddress = null;
	private String clientList = null;
	private String clientSize = null;

	//initialize the hand class with an empty arraylist
	public Hand()
	{
		handList = new ArrayList<Card>(); 
	}
	
	//deal one card from CardPile, the index number will increase one
	public Card getCard(int index)
	{
		return handList.get(index);
	}	
	
	public int findCard(Card pcard){
		return handList.indexOf(pcard);
	}
	
	//passing the one card as a argument and add that card to the hand arraylist
	public void addCard(Card pcard)
	{
		handList.add(pcard);
		
	}
	
	//passing the one card as a argument and remove that card from the hand arraylist
	public Card removeCard(int i)
	{
		if(i<0)
			return null;
		return handList.remove(i);
	}
	
	//remove all the elements in the hand arraylist
	public void removeHand()
	{
		handList.clear();
	}

	//return the integer which stand for the size of the hand
	public int sizeOfHand()
	{
		return handList.size();
	}
	
	//display the hand
	public String displayHand()
	{
		String x = "";
		for(int i = 0; i < handList.size(); i++)
		{
			x += handList.get(i).toString();
//			System.out.print(i+1 + ")" + x + " ");
		}
//		System.out.println("");
		return x;
	}
	
	//display the sorted hand
	public String displaySortedHand()
	{
		String x = "";
		sortHand();
		for(int i = 0; i < handList.size(); i++)
		{
			x += handList.get(i).toString();
//			System.out.print(i+1 + ")" + x + " ");
		}	
//		System.out.println("");
		return x;
	}
	
	//Sort hand to a descending rank order, when the rank are the same then sort suit for keeping neat
	public void sortHand()
	{
		//build a new array list and deleting one maxCard element from the handlist to the new list
		//sort the the hand according the the rank and the suit sort only for the neat
		ArrayList<Card> newHandList = new ArrayList<Card>();
		Card maxCard;
		while (handList.size() > 0)
		{
			maxCard = handList.get(0);
			for(int i = 1; i < handList.size(); i++)
			{
				if(handList.get(i).getRank().compareTo(maxCard.getRank()) > 0 
						|| handList.get(i).getRank().compareTo(maxCard.getRank()) == 0 
						&& handList.get(i).getSuit().compareTo(maxCard.getSuit()) > 0)
				{
					maxCard = handList.get(i);
				}
			} 
				handList.remove(maxCard);
				newHandList.add(maxCard);
		}
		handList = newHandList;
	}
	
	/*
	 * all this messages will be used as info between client and server
	 */
	public void setUsername(String str){
		username = str;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setIPaddress(String Ip){
		ipaddress = Ip;
	}
	
	public String getIPaddress(){
		return ipaddress;
	}
	
	public void setCommandLine(String cmd){
		command = cmd;
	}
	
	public String getCommandLine(){
		return command;
	}
	
	public void setMessage(String str){
		message = str;
	}
	
	public String getMessage(){
		return message;
	}
	
	public void setClientList(String str){
		clientList = str;
	}
	
	public String getClientList(){
		return clientList;
	}
	
	public void setClientSize(String str){
		clientSize = str;
	}
	
	public String getClientSize(){
		return clientSize;
	}
	
	
	public Suit getSuit(){
		return handList.get(0).getSuit();
	}
	
	public Rank getFirstRank(){
		return handList.get(0).getRank();
	}
	
	public Rank getLastRank(){
		return handList.get(handList.size() - 1).getRank();
	}


}
