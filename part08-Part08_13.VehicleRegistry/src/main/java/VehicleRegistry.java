import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;
    
    public VehicleRegistry(){
        owners = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(owners.get(licensePlate) == null){
            owners.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate){
        return owners.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(owners.get(licensePlate) != null){
            owners.remove(licensePlate);
            return true;
        }
        
        return false;
    }
}
