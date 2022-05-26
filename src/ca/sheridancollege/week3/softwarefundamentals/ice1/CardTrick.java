/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Brandon Wainberg
 * Date: 2022-05-26 
 * Time Start of Modify: 2:53pm
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
           magicHand[i] = new Card();
           magicHand[i].setValue((int)(Math.random()*13+1));
           magicHand[i].setSuit(Card.SUITS[(int)Math.random()*4]);
        }
        Scanner Card = new Scanner(System.in);
        System.out.println("Please enter the cards suit (Hearts,Diamonds,Spades,Clubs");
        String suit=Card.next();
        System.out.println("Please enter the cards number");
        int num=Card.nextInt();
        
        
        
        //insert code to ask the user for Card value and suit, create their card
          for(int i=0;i<magicHand.length;i++)
         {
             if (num==magicHand[i].getValue()&&suit==magicHand[i].getSuit())
                 System.out.println("Nice job the card is in the hand");
             else 
                 System.out.println("Unfortunatly the card you have guessed is not in the hand");
         }
        // and search magicHand here
        
        //Then report the result here
    }
    
}
