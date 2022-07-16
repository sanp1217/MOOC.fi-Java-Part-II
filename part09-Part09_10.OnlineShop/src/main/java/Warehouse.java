
import java.util.HashMap;
import java.util.Map;


public class Warehouse {
    private Map<String, Integer> productsWithPrices;
    private Map<String, Integer> productsWithStock;
    
    public Warehouse(){
        this.productsWithPrices = new HashMap<>();
        this.productsWithStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.productsWithPrices.put(product, price);
        this.productsWithStock.put(product, stock);
    }
    
    public int price(String product){
        return this.productsWithPrices.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return this.productsWithStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if(this.productsWithStock.get(product) == null){
            return false;
        }
        
        if(this.productsWithStock.get(product) > 0){
            int stock = this.productsWithStock.get(product) - 1;
            this.productsWithStock.replace(product, stock);
            
            return true;
        }
        
        return false;
    }
    
}
