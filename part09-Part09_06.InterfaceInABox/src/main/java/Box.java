
import java.util.ArrayList;


public class Box {
    private ArrayList<Packable> items;
    private double capacityInKG, currentWeight;
    
    public Box(double capacityInKG){
        this.capacityInKG = capacityInKG;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item){
        if(item.weight() + this.currentWeight <= this.capacityInKG){
            this.items.add(item);
            this.currentWeight += item.weight();
        }
    }
    
    public String toString(){
        return "Box: " + this.items.size() + " items, total weight " + this.currentWeight + " kg";
    }
    
    
    
}
