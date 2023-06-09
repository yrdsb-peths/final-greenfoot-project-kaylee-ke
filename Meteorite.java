import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the meteorite
 * 
 * @ Kaylee Ke 
 * @ May 29
 */
public class Meteorite extends Actor
{
    GreenfootImage idle = new GreenfootImage("stars/tile002.png");
    private int speed = 1;
    public static int size = 40;
    
    public Meteorite()
    {
        idle.scale(size,size);
        setImage(idle);
    }
    
    public void act()
    {
        moveUpDown();
    }
    
    public void moveUpDown()
    {
        setLocation(getX(), getY() + speed);
        
        // Check if the object has reached the top or bottom of the screen
        if (getY() <= 0 || getY() >= getWorld().getHeight() - 1) 
        {
            speed *= -1;  // Reverse the direction of movement
        }
    }
}
