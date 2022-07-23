
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>();
        
        list.add(-9);
        list.add(8);
        list.add(-1);
        
        System.out.println(positive(list));
        

    }
    
    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> positiveValues = numbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        
        return positiveValues;
    }

}
