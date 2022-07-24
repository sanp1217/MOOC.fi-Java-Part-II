
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        List<Integer> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            int input = scanner.nextInt();
            
            if(input < 0){
                break;
            }
            
            inputs.add(input);
        }
        
        inputs.stream()
                .filter(num -> num >= 1 && num <= 5)
                .forEach(num -> System.out.println(num));
        
    }
}
