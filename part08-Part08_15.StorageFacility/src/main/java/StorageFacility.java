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
}
