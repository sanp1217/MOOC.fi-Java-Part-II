
import java.util.HashMap;
import java.util.Map;


public class Warehouse {
    Map<String, Integer> productsWithPrices;
    
    public Warehouse(){
        this.productsWithPrices = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.productsWithPrices.put(product, price);
    }
    
    public int price(String product){
        return this.productsWithPrices.getOrDefault(product, -99);
    }
}
