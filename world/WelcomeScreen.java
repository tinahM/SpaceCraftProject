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
        super(600, 400, 1);
        prepare();
    }
    private void prepare(){
        addObject(logoPic,getWidth()/2,150);
        addObject(new Arrow(true),100,150);
        addObject(new Arrow(false),500,150);
        Play play = new Play();
        addObject(play,272,274);
        Instructions instructions = new Instructions();
        addObject(instructions,185,312);
        Exit exit = new Exit();
        addObject(exit,497,360);
        play.setLocation(321,266);
        instructions.setLocation(322,316);
        exit.setLocation(321,368);
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
