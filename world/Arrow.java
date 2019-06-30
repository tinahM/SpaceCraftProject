import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Arrow extends Actor
{
    private boolean isLeftArrow;
    public Arrow(boolean isLeft){
        GreenfootImage arrowImg = new GreenfootImage("arrow.png");
        arrowImg.scale(50,50);
        setImage(arrowImg);
        this.isLeftArrow = isLeft;
        if(isLeft){
            setRotation(180);
        }
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            WelcomeScreen world = (WelcomeScreen) getWorld();
            if(isLeftArrow){
                world.toggleRocket(-1);
            } else {
                world.toggleRocket(1);
            }
            Greenfoot.playSound("zapsplat_sound_design_whoosh_fast_006_32027.mp3");
        }
    }    
}
