
import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {
    private List<Item> products;
    
    public ShoppingCart(){
        this.products = new ArrayList<>();
    }
    
    public void add(String product, int price){
        this.products.add(new Item(product, 1, price));
    }
    
    public int price(){
        int price = 0;
        for(Item item: this.products){
            price += item.price();
        }
        
        return price;
    }
}
