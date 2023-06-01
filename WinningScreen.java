import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * switch to this screen when the rocket hits the button
 * 
 * @Kaylee Ke
 * @June 1
 */
public class WinningScreen extends World
{
    Label winningLabel = new Label("Good Job", 100);
    /**
     * Constructor for objects of class WinningScreen.
     * 
     */
    public WinningScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(winningLabel, getWidth()/2, 150);
    }
}
