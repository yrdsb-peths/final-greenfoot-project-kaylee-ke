import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * switch to this screen when the rocket hits the button
 * 
 * @ Kaylee Ke
 * @ June 1
 */
public class WinningScreen extends World
{
    Label labelOne = new Label("press 9 to continue;", 30);
    Label labelTwo = new Label("press 0 to end the game.", 30);
    //Label scoreLabel;
    //public int score;
    
    public WinningScreen()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        createLabel();
        
        addObject(labelOne, 300, 300);
        addObject(labelTwo, 300, 350);
        
        //scoreLabel = new Label(score, 45);
        //addObject(scoreLabel, 300, 250);
    }
    
    //public int setTheValue(int variable)
    //{
      //  score = variable;
        //return score;
    //}
    
    public void createLabel()
    {
        GoodJob good = new GoodJob();
        int x = 300;
        int y = 120;
        addObject(good, x, y);
    }
}
