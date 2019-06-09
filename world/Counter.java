import greenfoot.*; 

public class Counter extends Actor
{
    int score =0 ;
    int limit;
    public Counter(int limit){
        this.limit = limit;
    }
    public void act() 
    {
       setImage(new GreenfootImage("Score : " + score, 24, Color.GREEN, Color.BLACK));
    }  
    public void addScore()
    {
        if(score >= limit){
            ((Latar) getWorld()).finishLevel();
        }
        score++;
        
    }
    public void reset(){
        score = 0;
    }
    public int getScore(){
        return score;
    }
}
