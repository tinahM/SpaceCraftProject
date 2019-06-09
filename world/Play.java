import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Play extends Button
{
    public Play(){
        GreenfootImage img = new GreenfootImage(100,60);
        Font adjustedFont = new Font(true,true,38);
        img.setFont(adjustedFont);
        img.setColor(Color.BLACK);
        img.drawString("Play",0,50);
        setImage(img);
    }
    public void act() 
    {
        checkMouse();
        checkClick(new Latar());
    }    
}
