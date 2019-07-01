
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameInstructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameInstructions extends Actor
{
    /**
     * Act - do whatever the GameInstructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    
    public GameInstructions(){
        GreenfootImage img = new GreenfootImage(700,550);
        Font adjustedFont = new Font(true,true,33);
        img.setFont(adjustedFont);
        img.setColor(Color.RED);
        img.drawString("INSTRUCTIONS",0,40);
        
        GreenfootImage img2 = new GreenfootImage(700,500);
        Font adjustedFont2 = new Font(true,true,30);
        img.setFont(adjustedFont2);
        img.setColor(Color.BLUE);
        img.drawString("Gameplay",0,80);
        
        GreenfootImage img3 = new GreenfootImage(700,600);
        Font adjustedFont3 = new Font(true,true,25);
        img.setFont(adjustedFont3);
        img.setColor(Color.BLACK);
        img.drawString("This game consists of three levels. In the first level you will",0,130);
        img.drawString("face numerous non-firing enemy rockets with the task of ",0,170);
        img.drawString("reaching high score of 100 to reach level 2.In the second ",0,210);
        img.drawString("level, the rockets will have firing capabilities posing a ",0,250);
        img.drawString("tougher task to get past. In the third and final level, ther is",0,290);
        img.drawString("the all-powerful boss who is by far the toughest challenger",0,330);
        img.drawString("The task is made even harder by the randomly generated ",0,370);
        img.drawString("rockets which are generated to level-up the challenge",0,410);
        
        GreenfootImage img4 = new GreenfootImage(700,600);
        Font adjustedFont4 = new Font(true,true,30);
        img.setFont(adjustedFont4);
        img.setColor(Color.GREEN);
        img.drawString("Controls:",0,480);
        img.drawString("Movement: Arrow Keys",0,510);
        img.drawString("Fire: Space Bar",0,540);
        
        setImage(img);
    }
}
