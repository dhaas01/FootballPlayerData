package View;

import java.util.ArrayList;

public class View
{
    private InitialFrame iframe;
    
    public View()
    {
        iframe = new InitialFrame();
    }

    public void basicDisplay(String s)
    {
        System.out.println(s);
    }

    public void basicDisplay(ArrayList<String> arr)
    {
        for (String s : arr)
        {
            System.out.print(s + " ");
        }
        System.out.print("\n");
    }

    public void linesDisplay(ArrayList<ArrayList<String>> arr) 
    {
        for (ArrayList<String> s : arr) 
        {
            basicDisplay(s);
        }
    }
    
    //you should create your buttons in your initial setup and use the center update method to populate the footballplayerdata on them.
    public void CenterInitialSetup(int rows, int cols) 
    { 
        iframe.getIp().getCp().setGridDimensions(rows, cols);
    }
    
    public void CenterUpdate(ArrayList<ArrayList<String>> table, ArrayList<String> headers, int btnRow) 
    { 
        iframe.getIp().getCp().row(headers, btnRow);
        iframe.getIp().getCp().table(table);
    }

    /**
     * @return the iframe
     */
    public InitialFrame getIframe() {
        return iframe;
    }

    /**
     * @param iframe the iframe to set
     */
    public void setIframe(InitialFrame iframe) {
        this.iframe = iframe;
    }
}
   
