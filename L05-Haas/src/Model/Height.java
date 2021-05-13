package Model;

/**
 *
 * @author haasd
 */
public class Height {
    //Encapsulation private attributes and get and set methods for each attribute
    private int feet;
    private int inches;
    
    //Need all parameter constructor and no parameter constructor
    public Height(int feet, int inches) 
    { 
        this.feet = feet;
        this.inches = inches;
    }
    
    public Height() 
    { 
        feet = 0;
        inches = 0;
    }

    /**
     * @return the feet
     */
    public int getFeet() {
        return feet;
    }

    /**
     * @param feet the feet to set
     */
    public void setFeet(int feet) {
        this.feet = feet;
    }

    /**
     * @return the inches
     */
    public int getInches() {
        return inches;
    }

    /**
     * @param inches the inches to set
     */
    public void setInches(int inches) {
        this.inches = inches;
    }
    
    //Returns a string with the height attributes.
    @Override
    public String toString() 
    { 
        return feet + "'" + inches + '"';
    }
}
