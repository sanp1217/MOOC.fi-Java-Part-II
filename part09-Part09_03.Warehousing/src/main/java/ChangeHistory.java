
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
    
    public double maxValue(){
        if(this.prodHistory.isEmpty()){
            return 0.0;
        }else{
            double max = this.prodHistory.get(0);
            
            for(int i = 1; i < this.prodHistory.size(); i++){
                if(this.prodHistory.get(i) > max){
                    max = this.prodHistory.get(i);
                }
            }
            
            return max;
        }
    }
    
    public double minValue(){
        if(this.prodHistory.isEmpty()){
            return 0.0;
        }else{
            double min = this.prodHistory.get(0);
            
            for(int i = 1; i < this.prodHistory.size(); i++){
                if(this.prodHistory.get(i) < min){
                    min = this.prodHistory.get(i);
                }
            }
            
            return min;
        }
    }
    
    public double average(){
        double sum = 0;
        
        if(this.prodHistory.isEmpty()){
            return 0.0;
        }else{
            for(int i = 0; i < this.prodHistory.size(); i++){
                sum += this.prodHistory.get(i);
            }
        }
        
        return sum / this.prodHistory.size();
    }
}
