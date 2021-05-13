package Model;

public interface Displayable 
{
    /* 
    these first two methods are about an int attribute that will hold the number of the first line to be 
    displayed. The number represents the index of an element in the array of the class that implements 
    the TableData interface. 
    */
    public int getFirstLineToDisplay();
    public int getLineToHighlight();
    /* 
    the two methods above are about an int attribute that will hold the number of the line on the screen 
    that should be highlighted. It will be used only in a later assignment but it is part of the interface 
    and needs to be implemented even if it is not fully functional yet.
    */
    public int getLastLineToDisplay();
    public int getLinesBeingDisplayed();
    /* 
    these two methods are about an int attribute that will hold the number of the last line to be displayed.
    The number represents the index of an element in the array of the class that implements the TableData 
    interface.
    */
    public void setFirstLineToDisplay(int firstLine);
    public void setLineToHighlight(int hightlightedLine);
    /* 
    these two methods are about an int attribute that will hold the number of the lines that will appear 
    on the screen at one time. It will be most likely 20 but it should a variable. The application should 
    work with any number of lines. So if this number is set to 10 or 15, this is the number of lines that 
    should appear on the screen.
    */
    public void setLastLineToDisplay(int lastLine);
    public void setLinesBeingDisplayed(int numberOfLines);
}
