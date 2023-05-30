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
            move(-2);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-2);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+2);
        }
        
        checkCollision();
    }
    
    private void checkCollision()
    {
        if(isTouching(Meteorite.class)||isTouching(Meteorite2.class)||isTouching(Meteorite3.class)||isTouching(Meteorite4.class)||isTouching(Meteorite5.class)||isTouching(Meteorite.class))
        {
            Greenfoot.stop();
        }
    }
}
