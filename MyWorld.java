import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * the main world
 * 
 * @ Kaylee Ke
 * @ May 29
 */
public class MyWorld extends World
{
    private GreenfootSound backgroundMusic;
    private boolean isMusicPlaying;
    public int score = 0;
    Label scoreLabel;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        backgroundMusic = new GreenfootSound("sounds/background music.mp3");
        isMusicPlaying = false;
        
        Rocket rocket = new Rocket();
        addObject(rocket, 15, 200);
        
        scoreLabel = new Label(0, 30);
        addObject(scoreLabel, 20, 20);
        
        createMeteorite1();
        createMeteorite2();
        createMeteorite3();
        createMeteorite4();
        createMeteorite5();
        createButton();
    }
    
    //public void ToWinning()
    //{
        //WinningScreen winningScreen = new WinningScreen();
        //winningScreen.setTheValue(score);
        //Greenfoot.setWorld(winningScreen);
    //}
    
    /**
     * increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * decrease score
     */
    public void decreaseScore()
    {
        score--;
        scoreLabel.setValue(score);
    }
    
    /**
     * start to play the background music when the player enters the main world
     */
    public void act()
    {
        if(!isMusicPlaying)
        {
            backgroundMusic.playLoop();
            isMusicPlaying = true;
        }
    }
    
    public void createMeteorite1()
    {
        Meteorite meteorite1 = new Meteorite();
        int x = 100;
        int y = Greenfoot.getRandomNumber(400);
        addObject(meteorite1, x, y);
    }
    
    public void createMeteorite2()
    {
        Meteorite2 meteorite2 = new Meteorite2();
        int x = 200;
        int y = Greenfoot.getRandomNumber(400);
        addObject(meteorite2, x, y);
    }
    
    public void createMeteorite3()
    {
        Meteorite3 meteorite3 = new Meteorite3();
        int x = 300;
        int y = Greenfoot.getRandomNumber(400);
        addObject(meteorite3, x, y);
    }
    
    public void createMeteorite4()
    {
        Meteorite4 meteorite4 = new Meteorite4();
        int x = 400;
        int y = Greenfoot.getRandomNumber(400);
        addObject(meteorite4, x, y);
    }
    
    public void createMeteorite5()
    {
        Meteorite5 meteorite5 = new Meteorite5();
        int x = 500;
        int y = Greenfoot.getRandomNumber(400);
        addObject(meteorite5, x, y);
    }
    
    public void createButton()
    {
        Button button = new Button();
        //get a random number between 500 and 600
        int x = Greenfoot.getRandomNumber(101) + 500;
        int y = Greenfoot.getRandomNumber(400);
        addObject(button, x, y);
    }
}
