import greenfoot.*;
public class Boss extends Actor
{
 
    int direction = 1;
    private int jeda = 30;
    private int topBorder = 10, bottomBorder = 580;
    private boolean toRemove=false;
 
    public void act()
    {
        Level3 world = (Level3) getWorld();
        setLocation(getX(), getY()+direction);
        if (getY()==topBorder || getY()==bottomBorder) direction *= -1;
        jeda--;
 
        if(jeda % 70 == 0 && getX() < 780){
            getWorld().addObject(new EnemyLaser(),getX()-80,getY());
        } else if(jeda == 1){
            jeda = 75;
        }
        if(world.getHealth().getHealthStatus()==0){
            Hancur();
            if(toRemove)getWorld().removeObject(this);
        }
    }
 
    public void Hancur()
    {
        for(int i=0;i<10;i++){
            int px=-20+Greenfoot.getRandomNumber(40);
            int py=-20+Greenfoot.getRandomNumber(40);
            getWorld().addObject(new Pecahan(getImage()),getX()+px,getY()+py);
        }
        getWorld().addObject(new Bundaran(),getX(),getY());
        toRemove=true;
 
    }
 
    public void addedToWorld(World Latar)
    {
        GreenfootImage planeImg = new GreenfootImage("22.png");
        planeImg.scale(150,150);
        setImage(planeImg);
    }
}