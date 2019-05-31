import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Latar extends World
{
    Counter counter = new Counter();
    private int jeda=0;
    public Latar()
    {    
        super(600, 400, 1,false); 
        addObject (new Rocket(),100,200);
    }
    public void act()
    {
        addObject(counter, 100, 40);
        if(jeda>0)jeda--;
        else jeda=20;
        if(jeda==1){
            int py=Greenfoot.getRandomNumber(getHeight());
            addObject(new Enemy(-(2+Greenfoot.getRandomNumber(3))),getWidth()+200,py);
        }
    }
    public Counter getCounter()
    {
        return counter;
    }
}
