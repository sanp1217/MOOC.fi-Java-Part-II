
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        double sum = 0;
        int num, count = 0;
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            num = scanner.nextInt();
            
            if(num == 0){
                break;
            }else if(num > 0){
                sum += num;
                count++;
            }
        }
        //sum being 0 means no positive numbers were inputted.
        if(sum == 0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(sum / count);
        }
    }
}
