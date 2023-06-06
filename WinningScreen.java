import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * switch to this screen when the rocket hits the button
 * 
 * @ Kaylee Ke
 * @ June 1
 */
public class WinningScreen extends World
{
    Label labelOne = new Label("press 9 to continue;", 50);
    Label labelTwo = new Label("press 0 to end the game.", 50);
    
    public WinningScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        createLabel();
        addObject(labelOne, 300, 270);
        addObject(labelTwo, 300, 330);
    }
    
    public void createLabel()
    {
        GoodJob good = new GoodJob();
        int x = 300;
        int y = 120;
        addObject(good, x, y);
    }
}
