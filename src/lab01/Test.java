package lab01;

import java.util.ArrayList;

/**
 *
 * @author jaden.young
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Player> roster = new ArrayList<>(13);
        
        roster.add(new Player("Kevin Martin", "Guard", true, 23));
        roster.add(new Player("Nikola Pekovic", "Center", true, 14));
        roster.add(new Player("Ricky Rubio", "Guard", true, 9));
        roster.add(new Player("Andrew Wiggins", "Forward", true, 22));
        roster.add(new Player("Thaddeus Young", "Forward", true, 33));
        roster.add(new Player("Mo Williams", "Guard", false, 25));
        roster.add(new Player("Shabazz Muhammad", "Forward", false, 15));
        roster.add(new Player("Miroslav Raduljica", "Center", false, 13));
        roster.add(new Player("Anthony Bennett", "Forward", false, 24));
        roster.add(new Player("Chase Budinger", "Forward", false, 10));
        roster.add(new Player("Tory Daniels", "Guard", false, 30));
        roster.add(new Player("Robbie Humel", "Forward", false, 4));
        roster.add(new Player("Gorgui Dieng", "Center", false, 5));
    }
    
}