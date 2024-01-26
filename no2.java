import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class no2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class no2 extends no
{
    void cetakbaru(){
        no2 no2 = new no2();
        getWorld().addObject(no2,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+1);
    }
    public void act() 
    {
        super.act();
    }     
}

