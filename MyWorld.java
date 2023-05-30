import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the sky
 * 
 * @Kaylee Ke
 * @May 29
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Rocket rocket = new Rocket();
        addObject(rocket, 55, 200);
        
        createMeteorite1();
        createMeteorite2();
    }
    
    public void createMeteorite1()
    {
        Meteorite meteorite = new Meteorite();
        int x = 100;
        int y = Greenfoot.getRandomNumber(400);
        addObject(meteorite, x, y);
    }
    
    public void createMeteorite2()
    {
        Meteorite meteorite = new Meteorite();
        int x = 150;
        int y = Greenfoot.getRandomNumber(400);
        addObject(meteorite, x, y);
    }
}
