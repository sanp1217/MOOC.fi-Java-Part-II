
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container one = new Container();
        Container two = new Container();
        
        while (true) {
            System.out.println("First:" + one + "\n" + "Second: " + two);
            System.out.print("> ");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")){
                one.add(amount);
            }else if(command.equals("move")){
                int minAmount = Math.min(one.contains(), amount);
                two.add(minAmount);
                one.remove(amount);
            }else if(command.equals("remove")){
                two.remove(amount);
            }

        }
    }

}
