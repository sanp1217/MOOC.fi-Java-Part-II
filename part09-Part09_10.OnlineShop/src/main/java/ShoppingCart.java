
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> products;
    
    public ShoppingCart(){
        this.products = new HashMap<>();
    }
    
    public void add(String product, int price){
        this.products.putIfAbsent(product, new Item(product, 0, price));
        this.products.get(product).increaseQuantity();
    }
    
    public int price(){
        int price = 0;
        for(Item item: this.products.values()){
            price += item.price();
        }
        
        return price;
    }
    
    public void print(){
        for(Item item: this.products.values()){
            System.out.println(item);        
        }
    }
}
