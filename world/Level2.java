import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2 extends Latar
{
    private GreenfootImage rocketImg;
    public Level2(String rocketImgPath){
        super(rocketImgPath);
        this.rocketImg = new GreenfootImage(rocketImgPath);
        super.setCounter(new Counter(35));
    }

    public Level2(GreenfootImage rocketImg){
        super(rocketImg);
        this.rocketImg = rocketImg;
        super.setCounter(new Counter(5));
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
        if(jeda % 69 == 0){
            int py=Greenfoot.getRandomNumber(getHeight()-100);
            addObject(new ShootingEnemy(-2),getWidth()+200,py+50);
        }
        if(jeda % 59 == 0){
            int py=Greenfoot.getRandomNumber(getHeight()-100);
            addObject(new Enemy(-2),getWidth()+200,py+50);
        }
    }

    public void nextLevel(){
        if(Greenfoot.isKeyDown("Enter")){
            Greenfoot.setWorld(new Level3(rocketImg));
        }
    }
}
