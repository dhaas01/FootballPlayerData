package View;

//extend JFrame and JPanel from Javax swing library
import java.awt.*;
import javax.swing.*;
/*
InitialPanel has one other panel (in future assignments it will have more panels)
CenterPanel.java
with a row of buttons with the headers from the table
each attribute name in its own button
the number of buttons depend on the size of the array returned by getHeaders( )
with a row of buttons with the lines from the table
each attribute value in its own button
the number of lines depend on the value of the attribute linesBeingDisplayed
*/
//called from IntiialFrame, main job for now is to create another panel to be displayed
public class InitialPanel extends JPanel
{
    private CenterPanel cp;
    public InitialPanel() 
    { 
        super();
        cp = new CenterPanel();
        
        //(two lines of code) utilize border layout
        setLayout(new BorderLayout());        
        add(cp, "Center"); 
        
        cp.setBackground(Color.blue);
    }

    //need all parameter constructor
    
    /**
     * @return the cp
     */
    public CenterPanel getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(CenterPanel cp) {
        this.cp = cp;
    }
}
