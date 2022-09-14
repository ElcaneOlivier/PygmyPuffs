import ecs100.*;
import java.awt.Color;
/**
 * Write a description of class PygmyPuff here.
 *
 * @author Olivier
 * @version 25/07/22
 */
public class ClickNest
{
    private final int STARTX = 75;
    private final int YPOS = 100;
    private final int MAXpuffS = 7;
    
    private PygmyPuff[] puffBed = new PygmyPuff[MAXpuffS];
    
    /**
     * Constructor for objects fo Nest class
     */
    public ClickNest() {
        UI.initialise();
        UI.addButton("Random Grow", this::randomGrow);
        UI.addButton("Quit", UI::quit);
        
        for (int i = 0; i < MAXpuffS; i++) {
            Color col = new Color((float)Math.random(),(float)Math.random(), (float)Math.random());
            puffBed[i] = new PygmyPuff(STARTX*(i+1), YPOS, 10, 50, col);
        }
        
        for (PygmyPuff puff : puffBed) {
            puff.draw();
        }
        
        UI.setMouseListener(this::doMouse);
    }
    
    /**
     * Randomly grow the puffs in the array
     */
    public void randomGrow() {
        for (int i = 0; i < 10; i++) {
            int randompuff = (int) (Math.random() * MAXpuffS);            
            puffBed[randompuff].grow();
        }
    }
    
    /**
     * Select object base on where the user clicks
     */
    private void doMouse(String action, double x, double y) {
        if (action.equals("clicked")) {
            for (PygmyPuff puff : puffBed) {
                if ((x >= puff.getLeft()) && (x <= puff.getRight()) &&
                    (y >= puff.getTop()) && (y <= puff.getBottom())) {
                        puff.grow();
                    }
            }
        }
    }
}
