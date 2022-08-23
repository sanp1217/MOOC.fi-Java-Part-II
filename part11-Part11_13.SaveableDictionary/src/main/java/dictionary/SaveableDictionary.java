
package dictionary;

import java.util.HashMap;
import java.util.Map;

public class SaveableDictionary {
    private Map<String, String> translationsMap;
    
    public SaveableDictionary(){
        this.translationsMap = new HashMap<>();
    }
    
    public void add(String words, String translation){
        this.translationsMap.putIfAbsent(words, translation);
    }
    
    public String translate(String word){
        
    }
}
