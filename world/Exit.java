import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Exit extends Button
{
    public Exit(){
        GreenfootImage img = new GreenfootImage(100,60);
        Font adjustedFont = new Font(true,true,38);
        img.setFont(adjustedFont);
        img.setColor(Color.BLACK);
        img.drawString("Exit",0,50);
        setImage(img);
    }
    
    public void act() 
    {
        checkMouse();
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.stop();
        }
    }    
}
