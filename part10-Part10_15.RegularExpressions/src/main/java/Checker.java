

public class Checker {
    
    
    public boolean isDayOfWeek(String string){
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;
        }
        return false;
    }
}
