import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 500, 1); 
        prepare();
        Greenfoot.playSound("yt5s.io - Kevin MacLeod - Pixelland ♫ NO COPYRIGHT 8-bit Music (192 kbps).mp3");
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        rabbit rabbit = new rabbit();
        addObject(rabbit,153,403);
        candy1 candy1 = new candy1();
        addObject(candy1,18,17);
        candy2 candy2 = new candy2();
        addObject(candy2,140,16);
        candy3 candy3 = new candy3();
        addObject(candy3,274,19);
        candy4 candy4 = new candy4();
        addObject(candy4,1,96);
        candy4.setLocation(10,96);
        candy5 candy5 = new candy5();
        addObject(candy5,278,114);
        candy6 candy6 = new candy6();
        addObject(candy6,112,115);
        no2 no2 = new no2();
        addObject(no2,199,78);
        no3 no3 = new no3();
        addObject(no3,45,185);
        no4 no4 = new no4();
        addObject(no4,212,185);
        no5 no5 = new no5();
        addObject(no5,133,208);
        no4.setLocation(240,193);
        no3.setLocation(0,222);
        no4.setLocation(287,206);
        no2.setLocation(204,132);
        candy6.setLocation(72,65);
        Counter counter = new Counter("Skor:");
        addObject(counter,47,481);
        rabbit.setLocation(140,440);
        Counter2 counter2 = new Counter2("Lose:");
        addObject(counter2,256,478);
        counter2.setLocation(272,483);
        rabbit.setLocation(61,479);
        rabbit.setLocation(250,485);
        counter.setLocation(55,488);
        rabbit.setLocation(209,451);
        rabbit.setLocation(146,341);
        counter2.setLocation(254,488);
        rabbit.setLocation(234,485);
        rabbit.setLocation(137,403);
        rabbit.setLocation(149,403);

    }
}
