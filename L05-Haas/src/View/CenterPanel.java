package View;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;

public class CenterPanel extends JPanel
{
    private ArrayList<JButton> buttonsArray = new ArrayList();
    
    public CenterPanel() 
    { 
        super();
        
        setVisible(true);
        setBackground(Color.red);
    }
        
    public void gridPrep(int rows, int cols) 
    { 
        // loop through row
        for (int i = 0; i < rows; i++) 
        {
            //loop through col
            for (int j = 0; j < cols; j++) 
            { 
                //create JButton as variableName
                JButton btn = new JButton("row=" + i + ", col=" + j);
                //.add() variableName to new class array list variable
                buttonsArray.add(btn);
                //add() variableName to the form
                add(btn);
            }
        }
        validate();
    }
    
    public void row(ArrayList<String> data, int btnRow) // btnRow determine the first location in this instance where info is going to start populating
    {
        int _pos = btnRow * data.size(); // the position in the headerButtonsArray where the info is going to be put
        for (int i = 0; i < data.size(); i++) 
        { 
            this.buttonsArray.get(_pos).setText(data.get(i)); //the text is set from data into the position of the button in headerButtonsArray
            _pos++; // increments the position so the data is not put in the same spot
        }
    }
        
    public void table(ArrayList<ArrayList<String>> data) 
    { 
        //From a high level, my "table" loops through data and calls row to add() buttons to the panel.
        for (int i = 0; i < data.size(); i++) 
        {
            
            row(data.get(i), i+1);
        }
        validate();
    }
    
    //called from view class to determine how many rows and cols the grid will need
    public void setGridDimensions(int rows, int cols) 
    { 
        GridLayout grid = new GridLayout(rows,cols);
        setLayout(grid);
        gridPrep(rows,cols);
        validate();
    }

    /**
     * @return the headerButtonsArray
     */
    public ArrayList<JButton> getHeaderButtonsArray() {
        //need to create the headerButtonsArray based on the buttons in the first row; the headers
        return buttonsArray;
    }

    /**
     * @param headerButtonsArray the headerButtonsArray to set
     */
    public void setHeaderButtonsArray(ArrayList<JButton> headerButtonsArray) {
        this.buttonsArray = headerButtonsArray;
    }
}
