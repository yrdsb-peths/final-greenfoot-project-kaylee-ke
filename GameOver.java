import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game Over label
 * 
 * @ Kaylee Ke
 * @ June 2
 */
public class GameOver extends Actor
{
    GreenfootImage image = new GreenfootImage("images/over.png");
    
    public void act()
    {
        image.scale(250,150);
        setImage(image);
    }
}
