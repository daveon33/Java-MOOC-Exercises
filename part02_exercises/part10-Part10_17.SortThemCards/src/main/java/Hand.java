
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daveon
 */
public class Hand implements Comparable<Hand> {
    private List<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public List<Card> getHand() {
        return hand;
    }
    
    public void print() {
        this.hand.stream()
                .forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        hand.stream()
                .sorted((c1, c2) -> {
                    return c1.compareTo(c2);
                });
        
        Collections.sort(hand);
    }
    
    public int compareTo(Hand hand) {
        int thisTotal = this.hand.stream()
                .mapToInt(number -> number.getValue())
                .reduce(0, (acumulator, value) -> {
                    return acumulator + value;
                });
        
        int objectTotal = hand.getHand().stream()
                .mapToInt(number -> number.getValue())
                .reduce(0, (acumulator, value) -> {
                    return acumulator + value;
                });
        
        return thisTotal - objectTotal;
    } 
    
    public void sortBySuit() {
        Comparator<Card> comparator = Comparator
              .comparing(Card::getSuit)
              .thenComparing(Card::getValue);

    Collections.sort(hand, comparator);
    }
}
