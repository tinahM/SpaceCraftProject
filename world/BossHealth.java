import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BossHealth here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BossHealth extends Actor
{
    int health=20;
    int healthBarWidth=80;
    int healthBarHeight=10;
    int PixelsPerHealthPerPoint=(int)healthBarWidth/health;
    public BossHealth(){
        update();

    }

    public void act()
    {
        update();
        youLose();

    }

    public void update(){
        setImage(new GreenfootImage(healthBarWidth + 2,healthBarHeight + 2));
        GreenfootImage image = getImage();
        image.setColor(Color.WHITE);
        image.drawRect(0,0,healthBarWidth +1,healthBarHeight+1);
        image.setColor(Color.RED);
        image.fillRect(1, 1,health*PixelsPerHealthPerPoint,healthBarHeight);

    }

    public void loseHealth(){
        health--;

    }

    public int getHealthStatus(){
        return health;
    }

    public void youLose(){
        if(health==0){
            Level3 level3 = (Level3) getWorld();
            level3.finishLevel();
        }
    }
}