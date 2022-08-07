import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Hand {
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
}
