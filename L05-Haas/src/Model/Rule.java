package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Rule implements Comparator<FootballPlayer>
{
    int sortingBasedOn = 1; //default
    FootballPlayer f1 = new FootballPlayer();
    FootballPlayer f2 = new FootballPlayer();
    
    Rule(int sortingBasedOn) 
    { 
        this.sortingBasedOn = sortingBasedOn;
    }
    
    @Override
    public int compare(FootballPlayer fl, FootballPlayer f2) 
    { 
        if (sortingBasedOn == 1) 
        { 
            if(f1.getNumber() > f2.getNumber()){
          return 1;
        }else if(f1.getNumber() < f2.getNumber()){
          return -1;
        }else return 0;
        }else if (sortingBasedOn == 2) 
        { 
          return f1.getPosition().compareTo(f2.getPosition());          
        }else if (sortingBasedOn == 3) 
        { 
           return f1.getName().compareTo(f2.getName());
        }else if (sortingBasedOn == 4) 
        { 
            return f1.getHeight().compareTo(f2.getHeight());
        }else if (sortingBasedOn == 5) 
        { 
            if(f1.getWeight() > f2.getWeight()){
          return 1;
        }else if(f1.getWeight() < f2.getWeight()){
          return -1;
        }else return 0;
        }else if (sortingBasedOn == 6) 
        { 
            return f1.getHometown().compareTo(f2.getHometown());
        }else if (sortingBasedOn == 7) 
        { 
           return f1.getHighSchool().compareTo(f2.getHighSchool()); 
        }
        return 0;
    }
    
    Collections.sort(FootballPlayerData().players,new Rule(1));
    Collections.sort(players,new Rule(2));
    Collections.sort(players,new Rule(3));
    Collections.sort(players,new Rule(4));
    Collections.sort(players,new Rule(5));
    Collections.sort(players,new Rule(6));
    Collections.sort(players,new Rule(7));
}
/*      
// list of FootballPlayer call it players
/*Call Rule into Controller where the ClickEvent is*/