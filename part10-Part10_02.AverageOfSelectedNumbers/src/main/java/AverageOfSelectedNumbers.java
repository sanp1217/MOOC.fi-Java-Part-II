
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        List<String> nums = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        
        System.out.println("Input numbers, type \"end\" to stop");
        while(true){
            input = scanner.nextLine();
            
            if(input.equals("end")){
                break;
            }
            
            nums.add(input);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String posOrNeg = scanner.nextLine();
        
        if(posOrNeg.equals("n")){
            double negAvg = nums.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num < 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of negative numbers: " + negAvg);
        }
        
        if(posOrNeg.equals("p")){
            double posAvg = nums.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num > 0)
                    .average()
                    .getAsDouble();
            
            System.out.println("Average of positive numbers: " + posAvg);
        }

    }
}
