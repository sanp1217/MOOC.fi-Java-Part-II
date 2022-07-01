import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {
    HashMap<String, ArrayList<String>> storageMap;
    
    public StorageFacility(){
        this.storageMap = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.storageMap.putIfAbsent(unit, new ArrayList<>());
        
        this.storageMap.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return this.storageMap.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        this.storageMap.get(storageUnit).remove(item);
        
        if(this.storageMap.get(storageUnit).size() == 0){
            this.storageMap.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        
        for(String unit: this.storageMap.keySet()){
            if(!this.storageMap.get(unit).isEmpty()){
                units.add(unit);
            }
        }
        
        return units;
    }
}
