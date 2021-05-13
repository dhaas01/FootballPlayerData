package Model;

public class Person
{
   //bring the contents of your Person class from the first assignment
    //Encapsulation private attributes and get and set methods for each attribute
    private String name;
    private Height height;
    private int weight;
    private String hometown;
    private String highSchool;

    //Need no parameter constructor and all parameter constructor
    public Person(String name, Height height, int weight, String hometown, String highSchool) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hometown = hometown;
        this.highSchool = highSchool;
    }

    public Person() {
        name = "";
        height = new Height();
        weight = 0;
        hometown = "N/A";
        highSchool = "N/A";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the height
     */
    public Height getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Height height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the hometown
     */
    public String getHometown() {
        return hometown;
    }

    /**
     * @param hometown the hometown to set
     */
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    /**
     * @return the highSchool
     */
    public String getHighSchool() {
        return highSchool;
    }

    /**
     * @param highSchool the highSchool to set
     */
    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    //Returns a string for the person attributes including the height attribute by calling the toString method from Height.
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", " + height.toString() + ", weight=" + weight + ", hometown=" + hometown + ", highSchool=" + highSchool + '}';
    }
}
