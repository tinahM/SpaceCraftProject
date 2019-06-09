import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class ShootingEnemy extends Enemy
{
    /**
     * Act - do whatever the ShootingEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int jeda = 50;
    
    public ShootingEnemy(int v)
    {
        super(v);
    }
    public void act() 
    {
        jeda--;
        if(jeda % 18 == 0 && getX() < 580){
            getWorld().addObject(new EnemyLaser(),getX()-80,getY());
        } else if(jeda == 1){
            jeda = 20;
        }
        super.act();
    }
    public void addedToWorld(World Latar)
    {
        GreenfootImage planeImg = new GreenfootImage("robot.png");
        planeImg.scale(50,50);
        setImage(planeImg);
    }
}
