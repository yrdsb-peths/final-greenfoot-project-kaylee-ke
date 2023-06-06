import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meteorite2 here.
 * 
 * @Kaylee Ke
 * @May 30
 */
public class Meteorite2 extends Actor
{
    GreenfootImage idle = new GreenfootImage("stars/tile003.png");
    private int speed = 1;
    public static int size = 40;
    
    public Meteorite2()
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
