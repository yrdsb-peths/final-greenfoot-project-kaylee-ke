import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The rocket.
 * 
 * @ Kaylee Ke 
 * @ May 29
 */
public class Rocket extends Actor
{
    GreenfootImage[] idleRight = new GreenfootImage[6];
    GreenfootImage[] idleLeft = new GreenfootImage[6];
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    GreenfootSound collisionSound = new GreenfootSound("sounds/PUNCH.mp3");
    GreenfootSound successSound = new GreenfootSound("sounds/success sound.mp3");
    
    //direction the rocket is facing
    String facing = "right";
    
    /**
     * constructor
     */
    public Rocket()
    {
        for(int i=0; i<idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("rockets/image"+i+".png");
        }
        
        for(int i=0; i<idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("rockets/image"+i+".png");
            idleLeft[i].mirrorHorizontally();
        }
        setImage(idleRight[0]);
    }
    
    /**
     * animate the rocket
     */
    int imageIndex = 0;
    public void animateRocket()
    {
        //adjust the speed of the animation
        if(animationTimer.millisElapsed()<200)
        {
            return;
        }
        animationTimer.mark();
        
        //mirror the rocket
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex= (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex= (imageIndex + 1) % idleLeft.length;
        }
    }
    
    public void act()
    {
        // move the rocket.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
            facing = "left";
            MyWorld world = (MyWorld) getWorld();
            world.decreaseScore();
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(2);
            facing = "right";
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-2);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+2);
        }
        
        //switch to over screen when rocket touches the meteorite
        checkCollision();
        
        animateRocket();
        
        //switch to winning screen when rocket touches the button
        if(isTouching(Button.class))
        {
            successSound.play();
            switchToWinningWorld();
        }
    }
    
    private void checkCollision()
    {
        if(isTouching(Meteorite.class)||isTouching(Meteorite2.class)||isTouching(Meteorite3.class)||isTouching(Meteorite4.class)||isTouching(Meteorite5.class)||isTouching(Meteorite.class))
        {
            collisionSound.play();
            switchToOverWorld();
        }
    }
    
    private void switchToWinningWorld()
    {
        World newWorld = new WinningScreen();
        Greenfoot.setWorld(newWorld);
    }
    
    private void switchToOverWorld()
    {
        World newWorld = new OverScreen();
        Greenfoot.setWorld(newWorld);
    }
}
