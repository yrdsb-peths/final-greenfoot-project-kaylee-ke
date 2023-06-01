import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meteorite3 here.
 * 
 * @Kaylee Ke
 * @May 30
 */
public class Meteorite3 extends Actor
{
    GreenfootImage idle = new GreenfootImage("stars/tile004.png");
    private int speed = 1;
    public Meteorite3()
    {
        idle.scale(50,50);
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
