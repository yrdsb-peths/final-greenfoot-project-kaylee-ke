import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the game over screen
 * 
 * @ Kaylee Ke
 * @ June 2
 */
public class OverScreen extends World
{

    /**
     * Constructor for objects of class OverScreen.
     * 
     */
    public OverScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GameOver over = new GameOver();
        addObject(over, 300, 200);
        
        //resize the meteorites to the original value after game is over
        Meteorite.size = 40;
        Meteorite2.size = 40;
        Meteorite3.size = 40;
        Meteorite4.size = 40;
        Meteorite5.size = 40;
    }
}
