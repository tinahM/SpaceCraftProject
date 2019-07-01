import greenfoot.*; 

public class Counter extends Actor
{
    int score =0 ;
    int limit;
    boolean hasLimit = true;
    public Counter(int limit){
        this.limit = limit;
    }

    public Counter(boolean hasNoLimit){
        this.hasLimit = hasNoLimit;
        this.limit = 0;
    }

    public void act() 
    {
        if(this.hasLimit){
            setImage(new GreenfootImage("Score : " + score, 24, Color.GREEN, Color.BLACK));
        }
        else {
            int redRatio = Greenfoot.getRandomNumber(256);
            int greenRatio = Greenfoot.getRandomNumber(256);
            int blueRatio = Greenfoot.getRandomNumber(256);
            setImage(new GreenfootImage("BOSS LEVEL", 24, new Color(redRatio,greenRatio,blueRatio), Color.BLACK));
        }
    }  

    public void addScore()
    {
        score++;
        if(score >= limit && this.hasLimit){
            ((Latar) getWorld()).finishLevel();
        }
    }

    public void reset(){
        score = 0;
    }

    public int getScore(){
        return score;
    }
}
