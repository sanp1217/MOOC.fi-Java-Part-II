import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Hand implements Comparable<Hand>{
    private List<Card> hand;
    
    public Hand(){
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        this.hand.stream()
                .forEach(card -> System.out.println(card));
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    private int total(){
        int total = 0;
        
        for(Card  card: this.hand){
            total += card.getValue();
        }
        
        return total;
    }
    
    @Override
    public int compareTo(Hand hand) {
        int handTotal;
        int comparedTotal;
        
        handTotal = hand.total();
        comparedTotal = this.total();
        
        return comparedTotal - handTotal;
    }
}
