import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Latar
{
    BossHealth bossHealth = new BossHealth();
    public Level3(String rocketImg){
        super(rocketImg);
        super.setCounter(new Counter(false));
        addObject(new Boss(),500,200);
        addObject(bossHealth, 500, 40);
        spawnEnemy();
    }

    public Level3(GreenfootImage rocketImg){
        super(rocketImg);
        super.setCounter(new Counter(false));
        addObject(new Boss(),700,100);
        addObject(bossHealth, 500, 40);
        spawnEnemy();
    }

    public BossHealth getHealth(){
        return bossHealth;
    }
    private int jeda = 100;
    public void act(){
        super.act();
        jeda--;
        if(jeda == 0){
            jeda = 100;
        }
    }

    public void spawnEnemy(){
        if(jeda==1){
            int py=Greenfoot.getRandomNumber(getHeight()-100);
            addObject(new Enemy(-(2+Greenfoot.getRandomNumber(3))),getWidth()+200,py+50);
        }
    }

    public void nextLevel(){
        if(Greenfoot.isKeyDown("Enter")){
            Greenfoot.setWorld(new WelcomeScreen());
        }
    }
}
