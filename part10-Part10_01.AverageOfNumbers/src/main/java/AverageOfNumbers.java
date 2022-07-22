
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

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
        
        double average = nums.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        
        System.out.println("average of the numbers: " + average);

    }
}
