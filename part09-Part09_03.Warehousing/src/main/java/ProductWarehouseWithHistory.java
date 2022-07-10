
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory history;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }
    
    public String history(){
        return this.history.toString();
    }
}
