
import java.util.ArrayList;


public class Box implements Packable{
    private ArrayList<Packable> items;
    private double capacityInKG;
    
    public Box(double capacityInKG){
        this.capacityInKG = capacityInKG;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item){
        if(item.weight() + this.weight() <= this.capacityInKG){
            this.items.add(item);
        }
    }
    
    public double weight(){
        double weight = 0;
        
        for(Packable item: this.items){
            weight += item.weight();
        }
        
        return weight;
    }
    
    public String toString(){
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
    
    
    
}
