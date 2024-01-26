import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class candy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class candy1 extends candy
{
    /**
     * Act - do whatever the candy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    void cetakbaru(){
        candy1 candy1 = new candy1();
        getWorld().addObject(candy1,Greenfoot.getRandomNumber(300),0);
    }
    void maju(){
        setLocation(getX(), getY()+3);
    }
    
    public void act()
    {
        super.act();
    }
}
