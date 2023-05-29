import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The rocket.
 * 
 * @Kaylee Ke 
 * @May 29
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // move the rocket.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-1);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+1);
        }
    }
}
