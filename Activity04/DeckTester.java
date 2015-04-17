package Activity04;

import java.util.List;
import java.util.ArrayList;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"jack", "queen", "king"};
        String[] suits = {"blue", "red"};
        int[] pointValues = {11, 12, 13};
        Deck d = new Deck(ranks, suits, pointValues);

        System.out.println("**** Original Deck Methods ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card ****");
        System.out.println("  deal: " + d.deal());
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After 1 Card Dealt ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal Remaining 5 Cards ****");
        for (int i = 0; i < 5; i++) {
            System.out.println("  deal: " + d.deal());
        }
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After All Cards Dealt ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card From Empty Deck ****");
        System.out.println("  deal: " + d.deal());
        System.out.println();
        System.out.println();

        /* *** TO BE COMPLETED IN ACTIVITY 4 *** */
    }
    
    /**
     * Compares two ArrayLists to see if they are permutations of each other
     * @param a
     * @param b
     * @return a boolean to indicate whether a and b are permutations
     */
    /*public boolean arePermutations(Deck a, Deck b){
        if(a.size() != b.size())
            return false;
        else{
            for(Card aCard : a){
                for(Card bCard : b){
                    if(aCard.matches(bCard)){
                        a.remove(aCard);
                        b.remove(bCard);
                        break;
                    }
                }
            }
            if(a.size() == 0 && b.size() == 0)
                return true;
            else
                return false;
        }
    }*/
    
}
