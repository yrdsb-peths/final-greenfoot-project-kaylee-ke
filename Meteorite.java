import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the meteorite
 * 
 * @Kaylee Ke 
 * @May 29
 */
public class Meteorite extends Actor
{
    /**
     * Act - do whatever the Meteorite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // the track of the meteorite.
        while(getY() != 400)
        {
            setLocation(getX(), getY()+1);
        }
        
    }
}
