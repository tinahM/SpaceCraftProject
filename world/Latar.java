import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Latar extends World
{
    Counter counter = new Counter(100);
    Message message = new Message();
    Health rocketHealth = new Health();
    Rocket rocket = new Rocket();
    private int jeda=0;
    private boolean isRocketDead = false;
    private boolean isPaused = false;
    private boolean isLevelFinished = false;
    public Latar()
    {    
        super(600, 400, 1,false); 
        addObject (rocket,100,200);
    }
    public void act()
    {
        if(isRocketDead){
            message.setText("You Died!\nPress Enter to restart");
            message.setColor(Color.RED);
            addObject(message,300,200);
            removeObjects(getObjects(Enemy.class));
            if(Greenfoot.isKeyDown("Enter")){
                rocket = new Rocket();
                removeObject(message);
                counter.reset();
                rocketHealth.reset();
                addObject (rocket,100,200);
                isRocketDead = false;
            }
        } else if(isPaused){
            message.setText("Paused\nPress Esc to resume");
            message.setColor(Color.GREEN);
            addObject(message,300,200);
            if(Greenfoot.isKeyDown("escape")){
                removeObject(message);
                resumeGame();
            }
        } else if(isLevelFinished){
            message.setText("Level complete\nGood job!");
            message.setColor(Color.YELLOW);
            addObject(message,300,200);
        }else {
            if(Greenfoot.isKeyDown("escape")){
                pauseGame();
            }
            addObject(rocketHealth,180,40);
            addObject(counter, 60, 40);
            if(jeda==1){
                int py=Greenfoot.getRandomNumber(getHeight());
                addObject(new Enemy(-(2+Greenfoot.getRandomNumber(3))),getWidth()+200,py);
            }
        }
        if(jeda>0)jeda--;
        else jeda=20;
    }
    public Counter getCounter()
    {
        return counter;
    }
    public void loseHealth(int i){
        rocketHealth.loseHealth(i);
        if(rocketHealth.getHealthStatus() < 1){
            isRocketDead = true;
            rocket.Hancur();
        }
    }
    public boolean isGameOver(){
        return isRocketDead;
    }
    public void resumeGame(){
        isPaused = false;
    }
    public void pauseGame(){
        isPaused = true;
    }
    public boolean hasGamePaused(){
        return isPaused;
    }
    public void finishLevel(){
        isLevelFinished = true;
    }
}
