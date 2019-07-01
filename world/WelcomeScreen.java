import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class WelcomeScreen extends World
{
    String[] rocketImages = {"rocket.png","abc.png","airplane.png"};
    GreenfootImage logo = new GreenfootImage(rocketImages[0]);
    int curIndex = 0;
    Picture logoPic = new Picture(logo);
    public WelcomeScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    private void prepare(){
        addObject(logoPic,getWidth()/2,250);
        addObject(new Arrow(true),200,250);
        addObject(new Arrow(false),600,250);
        Play play = new Play();
        addObject(play,400,350);
        Instructions instructions = new Instructions();
        addObject(instructions,400,400);
        Exit exit = new Exit();
        addObject(exit,400,450);
    }
    
    public void toggleRocket(int step){
        curIndex += step;
        if(curIndex > 2){
            curIndex = 0;
        } else if(curIndex < 0){
            curIndex = 2;
        }
        logoPic.setImage(new GreenfootImage(rocketImages[curIndex]));
    }
    public String currentRocketImg(){
        return rocketImages[curIndex];
    }
}
