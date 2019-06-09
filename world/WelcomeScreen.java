import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class WelcomeScreen extends World
{
    public WelcomeScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    private void prepare(){
        GreenfootImage logo = new GreenfootImage("rocket.png");
        Picture logoPic = new Picture(logo);
        addObject(logoPic,getWidth()/2,120);
        Play play = new Play();
        addObject(play,272,274);
        play.setLocation(323,257);
        Instructions instructions = new Instructions();
        addObject(instructions,185,312);
        instructions.setLocation(156,364);
        instructions.setLocation(198,343);
        instructions.setLocation(198,343);
        Exit exit = new Exit();
        addObject(exit,497,360);
        exit.setLocation(530,343);
        exit.setLocation(508,340);
        exit.setLocation(457,338);
        instructions.setLocation(366,318);
        exit.setLocation(326,376);
        play.setLocation(321,266);
        instructions.setLocation(322,316);
        exit.setLocation(321,368);
    }
}
