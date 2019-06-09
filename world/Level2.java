import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2 extends Latar
{
    public Level2(){
        super();
        super.setCounter(new Counter(50));
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
        int py=Greenfoot.getRandomNumber(getHeight()-100);
        if(jeda % 69 == 0){
            addObject(new ShootingEnemy(-2),getWidth()+200,py+50);
        }
        if(jeda % 49 == 0){
            addObject(new Enemy(-2),getWidth()+200,py+50);
        }
    }
    public void nextLevel(){
        if(Greenfoot.isKeyDown("Enter")){
            Greenfoot.setWorld(new WelcomeScreen());
        }
    }
}
