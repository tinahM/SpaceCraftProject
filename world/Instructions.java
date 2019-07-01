import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Instructions extends Button
{
    public Instructions(){
        GreenfootImage title = new GreenfootImage(230,60);
        Font adjustedFont = new Font(true,true,40);
        title.setFont(adjustedFont);
        title.setColor(Color.BLACK);
        title.drawString("Instructions",0,50);
        setImage(title);
    }
    public void act() 
    {
        checkMouse();
        checkClick(new InstructionsWorld());
    }    
}
