import greenfoot.*;  

public class Enemy extends Actor
{
    private int vx=0;
    private boolean toRemove=false;
    
    public Enemy()
    {

    }
    
    public Enemy(int v)
    {
        vx=v;
    }
    
    public void addedToWorld(World Latar)
    {
        GreenfootImage planeImg = new GreenfootImage("sx.png");
        planeImg.scale(70,70);
        setImage(planeImg);
    }
    
    public void move()
    {
        setLocation(getX()+vx,getY());
        Actor actor =getOneIntersectingObject(Rocket.class);
        Latar latar = (Latar) getWorld();
        if(actor!=null){
            latar.loseHealth(1);
            Hancur();
        }
        if(getX()<0){
            latar.loseHealth(1);
            toRemove=true;
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
    public void act() 
    {
        Latar latar = (Latar)getWorld();
        if(!latar.isGameOver() && !latar.hasGamePaused()){
            if(! toRemove)move();
            else getWorld().removeObject(this);
        }
    }    
}
