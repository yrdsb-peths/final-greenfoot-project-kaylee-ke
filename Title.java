import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{
    GreenfootImage image = new GreenfootImage("images/title.png");
    
    public void act()
    {
        image.scale(500, 100);
        setImage(image);
    }
}
