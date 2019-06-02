import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Latar extends World
{
    Counter counter = new Counter(100);
    Message message = new Message();
    private int jeda=0;
    private boolean isRocketDead = false;
    private boolean isPaused = false;

    public Latar()
    {    
        super(600, 400, 1,false); 
        addObject (new Rocket(),100,200);
    }
    public void act()
    {
        if(isRocketDead){
            message.setText("You Died!\nPress Enter to restart");
            message.setColor(Color.RED);
            addObject(message,300,200);
            removeObjects(getObjects(Enemy.class));
            if(Greenfoot.isKeyDown("Enter")){
                removeObject(message);
                counter.reset();
                addObject (new Rocket(),100,200);
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
        } else {
            if(Greenfoot.isKeyDown("escape")){
                pauseGame();
            }
            addObject(counter, 100, 40);
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
    public void endGame(){
        isRocketDead = true;
    }
    
}
