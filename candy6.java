import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class candy6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class candy6 extends candy
{
    /**
     * Act - do whatever the candy6 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        candy6 candy6 = new candy6();
        getWorld().addObject(candy6,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act()
    {
        super.act();
    }
}
