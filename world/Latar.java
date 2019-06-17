import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Latar extends World
{
    Counter counter = new Counter(100);
    Message message = new Message();
    Health rocketHealth = new Health();
    Rocket rocket = new Rocket();
    private GreenfootImage rocketImg;
    private int jeda=0;
    private boolean isRocketDead = false;
    private boolean isPaused = false;
    private boolean isLevelFinished = false;
    public Latar(GreenfootImage rocketImg){
        super(600, 400, 1,false);
        this.rocketImg = rocketImg;
        //this.rocketImg.scale(80,100);
        rocket.setImage(rocketImg);
        addObject (rocket,100,200);
    }
    public Latar(String rocketImgPath)
    {    
        super(600, 400, 1,false);
        this.rocketImg = new GreenfootImage(rocketImgPath);
        if(rocketImgPath != "rocket.png"){
            this.rocketImg.scale(80,100);
        }
        rocket.setImage(rocketImg);
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
                rocket.setImage(this.rocketImg);
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
            message.setText("Level complete\nGood job!\nPress Enter");
            removeObjects(getObjects(Enemy.class));
            message.setColor(Color.YELLOW);
            addObject(message,300,200);
            nextLevel();
        }else {
            if(Greenfoot.isKeyDown("escape")){
                pauseGame();
            }
            addObject(rocketHealth,180,40);
            addObject(counter, 60, 40);
            spawnEnemy();
        }
        if(jeda>0)jeda--;
        else jeda=20;
    }
    public void spawnEnemy(){
        if(jeda==1){
            int py=Greenfoot.getRandomNumber(getHeight()-100);
            addObject(new Enemy(-(2+Greenfoot.getRandomNumber(3))),getWidth()+200,py+50);
        }
    }
    public Counter getCounter()
    {
        return counter;
    }
    public void setCounter(Counter c){
        counter = c;
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
    public void nextLevel(){
        if(Greenfoot.isKeyDown("Enter")){
            Greenfoot.setWorld(new Level2(rocketImg));
        }
    }
}
