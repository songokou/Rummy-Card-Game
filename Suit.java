/**
 * a suit class to help keep track of the suit information of a card
 */
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Suit implements Serializable{ 
	
	private String name;
	private String symbol;
	
	//suit method take 2 arguments name and symbol
	public Suit(String pname, String psymbol)
	{
		name = pname;
		symbol = psymbol;
	}
	
	//set suit characters
	public static Suit Clubs = new Suit("Clubs", "c");
	public static Suit Diamonds = new Suit("Diamonds", "d");
	public static Suit Heart = new Suit("Heart", "h");
	public static Suit Spades = new Suit("Spades", "s");
	
	  //build a unmodifiable collection 
	  //and make sure that nothing can ever get to the internal list
	private static List<Suit> suitlist = Arrays.asList(Clubs, Diamonds, Heart, Spades);
	
	public static List<Suit> getUnmodifiable() {
		return Collections.unmodifiableList(suitlist);
	}

	//get the name of the suit
	public String getName()
	{
		  return name;
	}
   
	//get the symbol of the suit
    public String getSymbol()
	{
		  return symbol;
	}
	 
    //get the symbol of the suit, used for the description in card class
	public String toString() 
	{
		   return symbol;
	}
		
	/*  Compare the suits of 2 card, 
     *  Result will be < 0 if this suit is lower  
     *  ==0 if the suits are the same, 
     *  > 0 if this suit is higher than the other suit.
     */	  
	  public int compareTo(Object anothersuit)
	  {
		  Suit s = (Suit) anothersuit;
		  int suit1 = (suitlist).indexOf(this);
		  int suit2 = (suitlist).indexOf(s);
		  return suit1-suit2;
	  }

}
