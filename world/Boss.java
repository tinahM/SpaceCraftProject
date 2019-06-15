import greenfoot.*; 
public class Boss extends Actor
{
   
        int direction = 1;
int speed = 2;
int topY = 10;
int lowerY = 380;
//For the topY and lowerY coordinates, I'm assuming the world is 600 pixels tall
 
public void act()
{
    setLocation(getX(), getY() + (direction * speed));
 
    if(getY() < topY) {
        direction = 1;
    }
    if(getY() > lowerY) {
        direction = -1;
    }
}
public void addedToWorld(World Latar)
    {
        GreenfootImage planeImg = new GreenfootImage("robot.png");
        planeImg.scale(150,150);
        setImage(planeImg);
    }
    }
    
 
     

