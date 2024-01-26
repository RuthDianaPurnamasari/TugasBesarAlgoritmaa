import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class no5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class no5 extends no
{
    /**
     * Act - do whatever the no5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        no5 no5 = new no5();
        getWorld().addObject(no5,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+1);
    }
    public void act() 
    {
        super.act();
    }     
}
