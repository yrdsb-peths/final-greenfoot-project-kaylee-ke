import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Name of the game
 * 
 * @ Kaylee Ke 
 * @ June 2
 */
public class Title extends Actor
{
    GreenfootImage image = new GreenfootImage("images/title.png");
    
    public void act()
    {
        image.scale(500, 100);
        setImage(image);
    }
}
