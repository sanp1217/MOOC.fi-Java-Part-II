
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        //First, get current weight.
        int currentWeight = 0;
        
        for(Item itemSearch: this.items){
            currentWeight += itemSearch.getWeight();
        }
        
        //Then, check if adding the item will go over limit.
        if(item.getWeight() + currentWeight <= this.capacity){
            this.items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        return this.items.contains(item);
    }
    
    
}
