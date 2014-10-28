package composite;


/**
 * Abstract class Burger - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Burger
{
    // instance variables - replace the example below with your own
    String order = "";
    public String getOrder()
    {
        return order;
    }
    
    public abstract double cost();
}
