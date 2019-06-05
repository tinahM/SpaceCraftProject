import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Health extends Actor
{
    int health = 5;
    int healthBarWidth = 80;
    int healthBarHeight = 10;
    int pixelsPerHealthPerPoint = healthBarWidth/health;
    
    public Health(){
        update();
    }
    
    public void act() 
    {
        update();
    }
    
    public void update(){
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage image = getImage();
        image.setColor(Color.WHITE);
        image.drawRect(0,0,healthBarWidth+1,healthBarHeight+1);
        if(health == 5){
            image.setColor(Color.GREEN);
        } else if(health > 3){
            image.setColor(Color.YELLOW);
        } else {
            image.setColor(Color.RED);
        }
        image.fillRect(1,1,health*pixelsPerHealthPerPoint,healthBarHeight);
    }
    
    public void loseHealth(int i){
        health-=i;
    }
    
    public int getHealthStatus(){
        return health;
    }
    public void reset(){
        health = 5;
    }
}
