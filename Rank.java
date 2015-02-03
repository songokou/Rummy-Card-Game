/**
 * a rank class which helps keep track of cards' ranks
 */
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Rank implements Serializable{
	  //Use for the set of Rank, for example: name-"Ten", accordingly, the symbol-"T"
	  private String name;
	  private String symbol;
	  
	  //build the rank method take the 2 strings as arguments
	  public Rank(String pName, String pSymbol) {
	      name = pName;
	      symbol = pSymbol;
	   }
	  
	  //Set Rank Characters
	  public static Rank Two = new Rank("Two", "2");
	  public static Rank Three = new Rank("Three", "3");
	  public static Rank Four = new Rank("Four", "4");
	  public static Rank Five = new Rank("Five", "5");
	  public static Rank Six = new Rank("Six", "6");
	  public static Rank Seven = new Rank("Seven", "7");
	  public static Rank Eight = new Rank("Eight", "8");
	  public static Rank Nine = new Rank("Nine", "9");
	  public static Rank Ten = new Rank("Ten", "10");
	  public static Rank Jack = new Rank("Jack", "j");
	  public static Rank Queen = new Rank("Queen", "q");
	  public static Rank King = new Rank("King", "k");
	  public static Rank Ace = new Rank("Ace", "1");
	  
	  //construct a unmodifiable collection 
	  //and make sure that nothing can ever get to the internal list
	  private static List<Rank> ranklist = Arrays.asList(Ace, Two, Three, Four, Five, Six, Seven,
              Eight, Nine, Ten, Jack, Queen, King);

	  public static List<Rank> getUnmodifiable() {
	      return Collections.unmodifiableList(ranklist);
	  }	  
	 
	  //get the name of the rank
	  public String getName()
	  {
		  return name;
	  }

	  //get the symbol of the rank
	  public String getSymbol()
	  {
		  return symbol;
	  }
	   
	  //get the symbol of the rank, used for the description in card class
	  public String toString()
	  {
		  return symbol;
	  }
		   
	  
	  /*  Compare the ranks of 2 card, 
	   *  Result will be < 0 if this rank is lower than 
	   *  the other rank, 0 if the ranks are the same, or > 0 if this 
	   *  rank is higher than the other rank.
	   */
	  public int compareTo(Object anotherRank)
	  {
		  Rank r = (Rank) anotherRank;
	      int rank1 = ranklist.indexOf(this);
	      int rank2 = ranklist.indexOf(r);
	      return rank1 - rank2;
	  }
	  
}