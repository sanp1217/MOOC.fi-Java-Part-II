public class ProductWarehouse extends Warehouse{
    private String prodName;
    
    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.prodName = productName;
    }
    
    public String getName(){
        return this.prodName;
    }
}
