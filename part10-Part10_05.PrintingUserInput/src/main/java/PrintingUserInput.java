
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            
            if(input.isEmpty()){
                break;
            }
            
            inputs.add(input);
        }
        
        inputs.stream()
                .forEach(input -> System.out.println(input));
    }
}
