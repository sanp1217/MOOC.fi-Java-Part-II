
import java.util.ArrayList;


public class ChangeHistory {
    private ArrayList<Double> prodHistory;
    
    public ChangeHistory(){
        this.prodHistory = new ArrayList<>();
    }
    
    public void add(double status){
        this.prodHistory.add(status);
    }
    
    public void clear(){
        this.prodHistory.clear();
    }
    
    public String toString(){
        return this.prodHistory.toString();
    }
}
