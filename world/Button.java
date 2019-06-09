import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    private boolean mouseOver = false;
    private static int MAX_TRANS = 255;
    
    public void checkMouse(){
        if(Greenfoot.mouseMoved(null)){
            mouseOver = Greenfoot.mouseMoved(this);
        }
        if(mouseOver){
            Transparency(MAX_TRANS/2);
        } else {
            Transparency(MAX_TRANS);
        }
    }
    
    public void checkClick(World world){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(world);
        }
    }
    
    public void Transparency(int change){
        GreenfootImage img = getImage();
        img.setTransparency(change);
        setImage(img);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
