import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class EnemyLaser extends Actor
{
    private boolean toRemove=false;
    private int vx=3;
    public void addedToWorld(World Latar)
    {
        GreenfootImage image=new GreenfootImage(50,10);
        image.setColor(Color.RED);
        image.drawLine(0,5,image.getWidth()-1,5);
        setImage(image);
    }
    
    public void act() 
    {
        Latar latar = (Latar) getWorld();
        if(latar.isGameOver()){
            toRemove = true;
        }
        if(!toRemove && !latar.hasGamePaused()){
            setLocation(getX()-vx,getY());
            Actor actor=getOneIntersectingObject(Rocket.class);
            if(actor!=null){
                latar.loseHealth(1);
                toRemove = true;
            }
            if (getX()<0)toRemove=true;
        }
        if(toRemove){
            getWorld().removeObject(this);
        }
    }    
}
