import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translationsMap = new HashMap<>();
    
    public void add(String word, String translation){
        this.translationsMap.putIfAbsent(word, new ArrayList<>());
        
        this.translationsMap.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        return this.translationsMap.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word){
        this.translationsMap.remove(word);
    }
    
}
