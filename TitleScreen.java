import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the title screen
 * 
 * @ Kaylee Ke 
 * @ June 2
 */
public class TitleScreen extends World
{
    Label labelOne = new Label("use ↑, ↓ , ← and → to move", 30);
    Label labelTwo = new Label("press <space> to start the game.", 30);
    
    private MyWorld myWorld;
    private Rocket rocket;
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        //insert the game's name
        Title title = new Title();
        addObject(title, 300, 100);

        //the instructions
        addObject(labelOne, 300, 270);
        addObject(labelTwo, 300, 330);
        
        //add the rocket
        myWorld = new MyWorld();
        rocket = new Rocket();
        addObject(rocket, 65, 218);
    }

    /**
     * switch to the main world
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        
        updatePosition();
    }
    
    /**
     * make the rocket on the title screen move spontaneously
     */
    private void updatePosition()
    {
        int newX = rocket.getX()+1;
        int newY = rocket.getY();
        rocket.setLocation(newX, newY);
    }
}
