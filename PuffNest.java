import ecs100.*;
import java.awt.Color;
/**
 * Write a description of class PygmyPuff here.
 *
 * @author Olivier
 * @version 25/07/22
 */
public class PuffNest
{
    private PygmyPuff p1;
    private PygmyPuff p2;
    private PygmyPuff p3;
    
    private final int MAXPUFFS = 6;
    private PygmyPuff[] flowerBed = new PygmyPuff[MAXPUFFS];
    /**
     * Constructor for objects of class PuffNest
     */
    public PuffNest()
    {
        p1 = new PygmyPuff(100, 200, 30, 30, Color.pink);
        p2 = new PygmyPuff(200, 200, 30, 30, Color.pink);
        p3 = new PygmyPuff(300, 200, 30, 30, Color.pink);
        
        p1.draw();
        p2.draw();
        p3.draw();
        
        UI.addButton("Feed PygmyPuff 1", p1::grow);
        UI.addButton("Feed PygmyPuff 2", p2::grow);
        UI.addButton("Feed PygmyPuff 3", p3::grow);
    }
}
