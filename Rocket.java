import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The rocket.
 * 
 * @Kaylee Ke 
 * @May 29
 */
public class Rocket extends Actor
{
    GreenfootImage[] idle = new GreenfootImage[6];
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * constructor
     */
    public Rocket()
    {
        for(int i=0; i<idle.length; i++)
        {
            idle[i] = new GreenfootImage("rockets/image"+i+".png");
        }
        setImage(idle[0]);
        
        animationTimer.mark();
    }
    
    /**
     * animate the rocket
     */
    int imageIndex = 0;
    public void animateRocket()
    {
        if(animationTimer.millisElapsed()<200)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
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
        animateRocket();
        
        if(isTouching(Button.class))
        {
            switchToWorld();
        }
    }
    
    private void checkCollision()
    {
        if(isTouching(Meteorite.class)||isTouching(Meteorite2.class)||isTouching(Meteorite3.class)||isTouching(Meteorite4.class)||isTouching(Meteorite5.class)||isTouching(Meteorite.class))
        {
            Greenfoot.stop();
        }
    }
    
    private void switchToWorld()
    {
        World newWorld = new WinningScreen();
        Greenfoot.setWorld(newWorld);
    }
}
