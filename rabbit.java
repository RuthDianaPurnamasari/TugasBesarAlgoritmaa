import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rabbit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rabbit extends Actor
{
    public rabbit(){
        GreenfootImage image = getImage();
        image.scale(150, 85);
    }
    void dimakan(){
        Counter.add(1);
        getWorld().removeObject(this);
    }
    
    public void act() 
    {   
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+1, getY());
        }
        else if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-1, getY());
        }
        if(isTouching(no.class)){
            Counter2.add(-1);
            dimakan();
        }
        if(Counter2.value==0){
            Greenfoot.delay(0);
            Greenfoot.setWorld(new endpage());
            getWorld().removeObject(this);
        }
    }    
}

 
