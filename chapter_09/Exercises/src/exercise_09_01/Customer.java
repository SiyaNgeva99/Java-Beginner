
package exercise_09_01;


public class Customer {
    private String name;
    private String ssn;
   
    // Encapsulate this class.  Make ssn read only.
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    
    public String getSSN(){
        return ssn;
    }
}
