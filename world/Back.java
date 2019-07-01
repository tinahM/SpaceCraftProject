import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Button
{
    public Back(){
        GreenfootImage img = new GreenfootImage(100,60);
        Font adjustedFont = new Font(true,true,38);
        img.setFont(adjustedFont);
        img.setColor(Color.BLACK);
        img.drawString("Back",0,50);
        setImage(img);
    }
    
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkMouse();
        checkClick(new WelcomeScreen());
    }    
}
