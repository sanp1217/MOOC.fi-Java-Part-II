
import java.util.ArrayList;
import java.util.List;


public class Herd implements Movable{
    private List<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    
    public void move(int dx, int dy){
        for(Movable movable: this.herd){
            movable.move(dx, dy);
        }
    }
    
    @Override
    public String toString(){
        String organism = "";
        
        for(Movable movable: this.herd){
            organism += movable.toString() + "\n";
        }
        
        return organism;
    }
    
    
}
