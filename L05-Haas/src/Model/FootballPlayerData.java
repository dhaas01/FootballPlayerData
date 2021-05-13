package Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//It is a requirement that you use a a HashMap which is subset of the Map data structure.
//See section 15.4 Maps on Horstmann's textbook. You will convert the data ArrayList to a 
//HashMap using each of the fields that will be used as a key for searching.

public class FootballPlayerData implements TableData, Displayable, Sortable, Searchable
{
    private ArrayList<TableMember> players;
    private int firstLine;
    private int highlightedLine;
    private int lastLine;
    private int numberOfLines;
    private int sortField;

    public FootballPlayerData()
    {
        firstLine = 0;
        numberOfLines = 20;
        lastLine = firstLine + numberOfLines;
        sortField = 0; //equal to what the user clicks on, would account for the column number. 
        //sortField is equal to sortingBasedOn in Rule
        players = new ArrayList<>();
        loadTable();
    }

    @Override
    public void loadTable()
    {
        ReadPlayersFromXML();
    }

    public void ReadPlayersFromXML()
    {
        try
        {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp != null)
            {
                try
                {
                    fp = (FootballPlayer) decoder.readObject();
                    players.add(fp);

                } catch (ArrayIndexOutOfBoundsException theend)
                {
                    //System.out.println("end of file");
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx)
        {
            xx.printStackTrace();
        }
    }
    
    //Returns the full table of data.
    @Override
    public ArrayList<TableMember> getTable()
    { 
        ArrayList<TableMember> table = players;
        return this.players;        
    }
    
    //The method will return an ArrayList of Strings with the names of the FootballPlayer fields (the "headers").
    @Override
    public ArrayList<String> getHeaders() 
    { 
        ArrayList<String> arr = new ArrayList();
        for (int i = 0; i <= 6; i++) 
        { 
            arr = this.players.get(i).getAttributeNames();
        }
        return arr;       
    }
    
    //The method will return an ArrayList of Strings with the values of the FootballPlayer object in a chosen line "n" in the table.
    @Override
    public ArrayList<String> getLine(int line) 
    { 
        return this.players.get(line).getAttributes(); 
    }
    
    //This methods used the getLine( ) method. It gets a set of lines (each one of them an array of Strings) from getLine(int n) and adds them to an array of arrays. It returns this array of arrays.
    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) 
    {
        ArrayList<ArrayList<String>> linesArr  = new ArrayList();
        for (int lines = firstLine; lines < lastLine; lines++) 
        { 
            linesArr.add(getLine(lines));
        }
        return linesArr;
    }
    
    
    //number of rows depends on the size of getHeaders()
    //number of lines depends on linesBeingDisplayed
    @Override
    public int getFirstLineToDisplay() 
    {
       return firstLine; 
    }
    @Override
    public int getLineToHighlight()
    { 
        return highlightedLine;
    }
    @Override
    public int getLastLineToDisplay() 
    { 
        return lastLine;
    }
    @Override
    public int getLinesBeingDisplayed() 
    { 
        return numberOfLines;
    }
    @Override
    public void setFirstLineToDisplay(int firstLine) 
    { 
        this.firstLine = firstLine;
    }
    @Override
    public void setLineToHighlight(int highlightedLine) 
    { 
        this.highlightedLine = highlightedLine;
    }
    @Override
    public void setLastLineToDisplay(int lastLine) 
    { 
        this.lastLine = this.firstLine + this.numberOfLines;
    }
    @Override
    public void setLinesBeingDisplayed(int numberOfLines) 
    { 
        this.numberOfLines = numberOfLines;
    }
    
    /*this is the method that will execute the sort itself.*/
    @Override
    public void sort() 
    { 
        //equal to compare in rule; same methods; probably just call 
    } 
    
    /*returns an int number (0 to n) to represent the user choice of the field to be used as the sort key*/
    @Override
    public int getSortField() 
    { 
        return sortField;
    }
    
    /*defines a new value for sortField*/
    @Override 
    public void SetSortField(int sortField) 
    { 
        this.sortField = sortField;
    }
    
    @Override
    public boolean search(String searchTerm)
    {
        
    }

    @Override
  public int getFoundIndex()
  { 
      
  }
  @Override
  public void setFoundIndex(int tableMemberindex)
  {
      
  }

  public boolean getFound() 
  public void setFound(boolean searchResult);

  public int getSearchByField();
  public void setSearchByField(int fieldIndex);
}
