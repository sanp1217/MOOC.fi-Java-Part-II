import java.util.ArrayList;
import java.util.HashMap;

public class Program {
    
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    public static void printKeys(HashMap<String, String> hashmap){
        ArrayList<String> keys = new ArrayList<>();
        
        for(String key: hashmap.keySet()){
            keys.add(key);
        }
        
        for(int i = 0; i < keys.size(); i++){
            System.out.println(keys.get(i));
        }
    }
    
    public static void printKeysWhere(HashMap<String, String> hashmap, String text){
        ArrayList<String> keys = new ArrayList<>();
        
        for(String key: hashmap.keySet()){
            if(!key.contains(text)){
                continue;
            }
            
            keys.add(key);
        }
        
        for(String key: keys){
            System.out.println(key);
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text){
        ArrayList<String> values = new ArrayList<>();
        
        for(String key: hashmap.keySet()){
            if(!key.contains(text)){
                continue;
            }
            
            values.add(hashmap.get(key));
        }
        
        for(String value: values){
            System.out.println(value);
        }
    }
    
    
}
