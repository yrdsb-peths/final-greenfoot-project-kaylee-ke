import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * get to the winning screen when the rocket hits the button
 * 
 * @ Kaylee Ke 
 * @ June 1
 */
public class Button extends Actor
{
    public void act()
    {
        resizeImage(30,30);
    }
    
    private void resizeImage(int width, int height)
    {
        GreenfootImage image = getImage();
        image.scale(width, height);
        setImage(image);
    }
}
