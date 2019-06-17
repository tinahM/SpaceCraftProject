import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Laser extends Actor
{
    private boolean toRemove=false;
    private int vx=3;
    public void addedToWorld(World Latar)
    {
     /*   GreenfootImage image=new GreenfootImage(50,10);
        image.setColor(Color.YELLOW);
        image.drawLine(0,5,image.getWidth()-1,5);
        setImage(image);*/
    }
    public void act() 
    {
        Latar latar = (Latar) getWorld();
        if(latar.isGameOver()){
            toRemove = true;
        }
        if(!toRemove && !latar.hasGamePaused()){
            setLocation(getX()+vx,getY());
            Actor actor=getOneIntersectingObject(Enemy.class);
            if(actor!=null && getX() < 580){
                Counter counter =latar.getCounter();
                counter.addScore();
                ((Enemy)actor).Hancur();
                toRemove = true;
            }
            if (getX()>getWorld().getWidth())toRemove=true;
        }
        if(toRemove){
            getWorld().removeObject(this);
        }
    }    
}
