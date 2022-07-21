
public class Dog extends Animal{
    
    public Dog(String name) {
        super(name);
    }
    
    public Dog(){
        super("Dog");
    }
    
    public void bark(){
        System.out.println(super.getName() + " barks");
    }
    
}
