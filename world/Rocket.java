import greenfoot.*; 
public class Rocket extends Actor
{
    private int targetx=0,targety=0;
    private int jeda=0;
    private boolean toRemove=false;
   
    public void addedToWorld(World Latar)
       {
        targetx=getX();targety=getY();
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
    public void move()
    {
        
        int posX=getX();
        int posY=getY();
            if(Greenfoot.isKeyDown("up"))
            {
                posY-=5;
            }
            else if(Greenfoot.isKeyDown("down"))
            {
                posY+=5;
            }
            else if(Greenfoot.isKeyDown("left"))
            {
                posX-=5;
            }
            else if(Greenfoot.isKeyDown("right"))
            {
                posX+=5;
            }
            if(posX<10 || posX>550 || posY>380 || posY<10){
                setLocation(getX(),getY());
            }else{
                setLocation(posX,posY);
            }
    }
    public void act() 
    {
        Latar latar = (Latar) getWorld();
        if(!latar.hasGamePaused() || !latar.isGameOver()){
            move();
        
            if(Greenfoot.isKeyDown("space")&& jeda % 8==0){
                getWorld().addObject(new Laser(),getX()+80,getY());
            }else{
                if(jeda==0)jeda=40;
            }
            
            if(toRemove)getWorld().removeObject(this);
            jeda--;
        }
    }
}
