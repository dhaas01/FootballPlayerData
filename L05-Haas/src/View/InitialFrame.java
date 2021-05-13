package View;

//extend JFrame and JPanel from Javax swing library
import java.awt.*;
import javax.swing.*;

//InitialFrame then creates the InitialPanel
public class InitialFrame extends JFrame
{
    private InitialPanel ip;
    
    public InitialFrame() 
    { 
        super("IST 242 Demo");
        
        ip = new InitialPanel();
        add(ip);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (600, 480);
        setBackground(Color.gray);
        setVisible(true);
    }
    
    /**
     * @return the ip
     */
    public InitialPanel getIp() {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(InitialPanel ip) {
        this.ip = ip;
    }
}
