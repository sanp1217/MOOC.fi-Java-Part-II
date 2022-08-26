
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
        String translation = null;
        
        if(this.translationsMap.containsKey(word)){
            translation = this.translationsMap.get(word);
        }
        
        if(this.translationsMap.containsValue(word)){
            for(String key: this.translationsMap.keySet()){
                if(this.translationsMap.get(key).equals(word)){
                    translation = key;
                }
            }
        }
        
        return translation;
    }
    
    public void delete(String word){
        String translation = null;
        
        if(this.translationsMap.containsKey(word)){
            this.translationsMap.remove(word);
        }
        
       if(this.translationsMap.containsValue(word)){
           for(String key: this.translationsMap.keySet()){
               if(this.translationsMap.get(key).equals(word)){
                   translation = key;
                   this.translationsMap.remove(translation);
               }
           }
       }
    }
}
