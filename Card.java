/**
 * a card class to store the basic card information
 * rank, suit and image
 */

import java.io.Serializable;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Card extends JButton implements Serializable{
	
	//The basic info for each card
  private Rank rankV;
  private Suit suitV;
  private ImageIcon iconV;
  
  //define the card class, take rank and suit as the arguments
  public Card(Rank prank, Suit psuit, ImageIcon icon)
  {
	  super.setIcon(icon);
	  iconV = icon;
	  rankV = prank;
	  suitV = psuit;
  } 
  
  public ImageIcon getIcon()
  {
	  return iconV;
  }
  
  public void setIcon(ImageIcon icon)
  {
	  iconV = icon;
	  super.setIcon(icon);
  }
  
  //get rank from the card
  public Rank getRank()
  {
	  return rankV;
  }
  
  //get the suit from the card
  public Suit getSuit()
  {
	  return suitV;
  }
  
  //use for the description of the card, i.e:"H5"---Heart Five.
  public String toString()
  {
	  return suitV.toString() + rankV.toString();
  }
  
  //compare two cards' rank, the return d_value will give the difference between them.
  public int compareTo(Object anotherCard)
  {
	  Card c = (Card) anotherCard;
	  return compareTo(c.getRank());
  }
  
  //determine if two cards are same, 
  //if the suit and rank are the same return true, else return false
  public boolean isSameAs(Card card)
  {
	  if(rankV != card.rankV || suitV != card.suitV)
		  return false;
	  else
		  return true;
  }
  
}