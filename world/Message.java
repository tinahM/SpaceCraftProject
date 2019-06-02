import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private String message;
    private Color color = Color.RED;
    public Message(){
        setImage(new GreenfootImage("", 30, Color.RED, Color.BLACK));
    }
    public Message(String message){
        this.message = message;
        setImage(new GreenfootImage(this.message, 30, Color.RED, Color.BLACK));
    }
    
    public void setText(String text){
        this.message = text;
    }
    
    public void setColor(Color color){
        this.color = color;
    }
    
    public void act() 
    {
        setImage(new GreenfootImage(this.message, 30, this.color, Color.BLACK));
    }    
}
