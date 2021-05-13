package Controller;

import Model.Model;
import View.View;

import java.lang.Object;
import java.util.EventObject;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Controller
{

    Model model;
    View view;

    public Controller(View v, Model m)
    {
        model = m;
        view = v;
        
        view.CenterInitialSetup(model.getFpData().getLinesBeingDisplayed()+1, model.getFpData().getHeaders().size());
        view.CenterUpdate(model.getFpData().getLines(model.getFpData().getFirstLineToDisplay(), 
            model.getFpData().getLastLineToDisplay()), model.getFpData().getHeaders(), model.getFpData().getFirstLineToDisplay());
        this.addListeners();
    }
    
/*Implement scrolling*/
    private void addListeners()
    { 
        view.getIframe().getIp().getCp().addMouseWheelListener(
            new MouseWheelListener()
        {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) 
            { 
                int units = e.getUnitsToScroll();
                //use "units" to update first and last line to display
                int firstLine = model.getFpData().getFirstLineToDisplay() + units;
                model.getFpData().setFirstLineToDisplay(firstLine);
                int lastLine = model.getFpData().getLinesBeingDisplayed() + firstLine;
                model.getFpData().setLastLineToDisplay(lastLine);
                
                //Then refresh the screen using CenterUpdate in View
               if (lastLine < model.getFpData().getTable().size()) 
               {
                    view.CenterUpdate(model.getFpData().getLines(firstLine, lastLine), model.getFpData().getLine(units), model.getFpData().getFirstLineToDisplay());
               }
            }
        }
        );
        
    /*The listening to the headers functionality will be implemented using the Interface ActionListener.*/
        for (int i = 0; i < view.getIframe().getIp().getCp().getHeaderButtonsArray().size(); i++) 
        {
            view.getIframe().getIp().getCp().getHeaderButtonsArray().get(i).addActionListener(
            new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                { 
                    //Write the code for what it is needed when the button is clicked
                    JButton b = (JButton) e.getSource();
                    b.setBackground(Color.red);
                }
            }
            ); 
        }
        
        
    }
}
