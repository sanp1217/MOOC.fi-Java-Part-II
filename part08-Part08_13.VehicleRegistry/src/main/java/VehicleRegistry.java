import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;
    
    public VehicleRegistry(){
        this.owners = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(this.owners.get(licensePlate) == null){
            this.owners.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate){
        return this.owners.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(owners.get(licensePlate) != null){
            owners.remove(licensePlate);
            return true;
        }
        
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate plate: this.owners.keySet()){
            System.out.println(plate.toString());
        }
    }
    
    public void printOwners(){
        ArrayList<String> ownersNonRepeated = new ArrayList<>();
        
        //Adding values in hashmap to a list that will have no repeats.
        for(String owners: this.owners.values()){
            if(!ownersNonRepeated.contains(owners)){
                ownersNonRepeated.add(owners);
            }
        }
        
        //Printing the owners.
        for(String owners: ownersNonRepeated){
            System.out.println(owners);
        }
    }
}
