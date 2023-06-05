import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    }
    
    public void act()
    {
        Greenfoot.stop();
    }
}
