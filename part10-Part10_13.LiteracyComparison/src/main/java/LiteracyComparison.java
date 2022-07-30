
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<LiteracyResult> results = new ArrayList<>();
        
        try{
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new LiteracyResult(parts[2].replace("(%)", "").trim(), parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                    .forEach(result -> results.add(result));
            
        }catch(Exception e){
            System.out.println("Error");
        }
        
       
        
        results.stream()
                .sorted(Comparator.comparingDouble(LiteracyResult::getLitPercent))
                .forEach(result -> System.out.println(result));
    }
}
