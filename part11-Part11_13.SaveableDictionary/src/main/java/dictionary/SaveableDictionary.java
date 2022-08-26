
package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private Map<String, String> translationsMap;
    private String file;
    
    public SaveableDictionary(){
        this.translationsMap = new HashMap<>();
    }
    
    public SaveableDictionary(String file){
        this.translationsMap = new HashMap<>();
        this.file = file;
    }
    
    public boolean load(){
        try (Scanner scanner = new Scanner(Paths.get(this.file))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                
                add(parts[0], parts[1]);
            }
            return true;
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    public boolean save(){
        try(PrintWriter writer = new PrintWriter(this.file)){
            for(String key: this.translationsMap.keySet()){
                writer.println(key + ":" + this.translationsMap.get(key));
            }
            return true;
            
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
            return false;
        }
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
        
        if(this.translationsMap.containsKey(word)){
            this.translationsMap.remove(word);
        }
        
        String remove = "";
       if(this.translationsMap.containsValue(word)){
           for(String key: this.translationsMap.keySet()){
               if(this.translationsMap.get(key).equals(word)){
                   remove = key;
               }
           }
           this.translationsMap.remove(remove);
       }
    }
}
