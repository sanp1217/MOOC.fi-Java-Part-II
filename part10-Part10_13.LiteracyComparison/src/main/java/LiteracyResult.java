
public class LiteracyResult {
    private String gender, country;
    private int year;
    private double litPercent;
    
    public LiteracyResult(String gender, String country, int year, double litPercent){
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.litPercent = litPercent;
    }
    
    public double getLitPercent(){
        return this.litPercent;
    }
    
    @Override
    public String toString(){
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.litPercent; 
    }
}
