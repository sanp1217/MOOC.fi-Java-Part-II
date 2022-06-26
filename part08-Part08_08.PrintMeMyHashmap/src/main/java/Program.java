import java.util.ArrayList;
import java.util.HashMap;

public class Program {
    
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
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
}
