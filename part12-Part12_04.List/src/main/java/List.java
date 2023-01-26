public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;
    
    public List(){
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }
    
    public void add(Type value){
        if(this.firstFreeIndex == this.values.length){
            grow();
        }
        
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }
    
    public void grow(){
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        
        for(int i = 0; i < this.values.length; i++){
            newValues[i] = this.values[i];
        }
        
        this.values = newValues;
    }
    
    
}