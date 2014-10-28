package composite;


/**
 * Abstract class Cheese - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Cheese extends Burger
{
    public static int count = 0;
    static double cost = 0;
    static boolean flag = false;
    public abstract String getOrder();
}
