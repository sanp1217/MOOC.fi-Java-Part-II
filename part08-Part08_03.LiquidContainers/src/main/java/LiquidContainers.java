
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        int containerOne = 0, containerTwo = 0;
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("First: " + containerOne + "/" + "100");
            System.out.println("Second: " + containerTwo + "/" + "100");
            
            System.out.print("> ");
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")){
                if(amount > 0){
                    containerOne += amount;
                }
                if(containerOne > 100){
                    containerOne = 100;
                }
            }else if(command.equals("move")){
                if(amount > 0 && amount <= containerOne){
                    containerTwo += amount;
                    containerOne -= amount;
                }else{
                    containerTwo += containerOne;
                    containerOne = 0;
                }
                if(containerTwo > 100){
                    containerTwo = 100;
                }
            }else if(command.equals("remove")){
                if(amount > containerTwo){
                    containerTwo = 0;
                }else{
                    containerTwo -= amount;
                }
            }
        }
    }

}
