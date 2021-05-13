package Model;
import java.util.ArrayList;

public class FootballPlayer extends Person implements TableMember
{
    //Encapsulated attributes
    private int number;
    private String position;
    
    //Need no parameter and all parameter constructors
    public FootballPlayer(String name, Height height, int weight, String hometown, String highSchool, int number, String position) 
    { 
        super(name, height, weight, hometown, highSchool);
        this.number = number;
        this.position = position;
    }
    
    public FootballPlayer() 
    { 
        super();
        number = 0;
        position = "N/A";
    }
    
    //Returns a string for the FootballPlayer attributes (might need to change slightly)
    @Override 
    public String toString() 
    { 
       return super.toString() + " FootballPlayer{" + "number=" + number + ", position=" + position + '}';          
    }

    /**
     * @return the number
     */
    public int getNumber() 
    {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number)
    {
        this.number = number;
    }

    /**
     * @return the position
     */
    public String getPosition() 
    {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) 
    {
        this.position = position;
    }
    
    /*A strategy
    if you develop getAttribute(int n) first, then you can use it in getAttributes( ) with a for loop getting each getAttribute(int n).
    The other way is also true, if you develop getAttributes( ) first, then you can use it to retrieve one element at a time as needed by getAttributes(int n).
    */
    //Returns the value of a specific attribute. The input parameter start with 0 for the first attribute, then 1 for the second attribute and so on.
    @Override
    public String getAttribute(int n) 
    {
        if (n == 0) 
        { 
            return String.valueOf(getNumber())+" ";
        }
        if (n == 1) 
        { 
            return position+" ";
        }
        if (n == 2) 
        { 
            return getName()+" ";
        }
        if (n == 3) 
        { 
            return getHeight().toString()+" ";
        }
        if (n == 4) 
        { 
            return String.valueOf(getWeight())+" ";
        }
        if (n == 5) 
        { 
           return getHometown()+" ";
        }
        else
        {
            return getHighSchool()+" ";
        }
    }
    
    //Returns the value of all attributes as an ArrayList of Strings.
    @Override
    public ArrayList<String> getAttributes() 
    { 
        ArrayList<String> arr = new ArrayList();
        for (int n = 0; n <= 6; n++) 
        {
            arr.add(getAttribute(n));
        }
        return arr;
    }
    
    //Returns the name of a specific attribute. The input parameter start with 0 for the first attribute, then 1 for the second attribute and so on.
    @Override
    public String getAttributeName(int n) 
    {
        if (n == 0) 
        { 
            return "number ";
        }
        if (n == 1) 
        { 
            return "position ";
        }
        if (n == 2) 
        { 
            return "name ";
        }
        if (n == 3) 
        { 
            return "height ";
        }
        if (n == 4) 
        { 
            return "weight ";
        }
        if (n == 5) 
        { 
            return "hometown ";
        }
        else
        {
            n = 6;
            return "high school ";
        }
    }
    
    //Returns the name of all attributes as an ArrayList of Strings.
    @Override
    public ArrayList<String> getAttributeNames() 
    { 
        ArrayList<String> arr = new ArrayList();
        for(int n = 0; n <= 6; n++) 
        {
            arr.add(getAttributeName(n));
        }
        return arr;
    }
}
