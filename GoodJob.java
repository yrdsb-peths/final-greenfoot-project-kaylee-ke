import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * continue or end the game
 * 
 * @Kaylee Ke 
 * @June 2
 */
public class GoodJob extends Actor
{
    GreenfootImage image = new GreenfootImage("images/goodJob.png");
    
    public void act()
    {
        image.scale(450,150);
        setImage(image);
        
        //press 9 to continue, press 0 to end the game (switch ro the end screen)
        checkKeyPress();
    }
    
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("9"))
        {
            switchToWorld(new MyWorld());
            Meteorite.size += 10;
            Meteorite2.size += 10;
            Meteorite3.size += 10;
            Meteorite4.size += 10;
            Meteorite5.size += 10;
        }
        else if(Greenfoot.isKeyDown("0"))
        {
            switchToWorld(new OverScreen());
        }
    }
    
    private void switchToWorld(World newWorld)
    {
        Greenfoot.setWorld(newWorld);
    }
}
