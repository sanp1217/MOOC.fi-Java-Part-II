public class Student extends Person{
    private int studyCredits;
    
    public Student(String name, String address){
        super(name, address);
        this.studyCredits = 0;
    }
    
    public void study(){
        this.studyCredits++;
    }
    
    public int credits(){
        return this.studyCredits;
    }
    
    public String toString(){
        return super.toString() + "\n\tStudy credits " + this.studyCredits;
    }
}
