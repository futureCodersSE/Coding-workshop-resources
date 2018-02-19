import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WaterWorld here.
 * 
 * @author (futureCodersSE) 
 * @version (template v1 5th February 2018)
 */
public class WaterWorld extends World
{

    //Constructor for objects of class WaterWorld.
    public WaterWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setBackground("images/bluerock.jpg");
        populate();
    }
    
    private void populate(){
        addObject(new WaterBug(),300,200);
        addObject(new Rock(),400, 300);
        addObject(new Rock(), 200, 100);
        addObject(new Rock(), 550, 50);
        addObject(new Rock(), 75, 350);
        addObject(new Frog(), 100, 100);
    }
}


