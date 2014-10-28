package composite;


/**
 * Abstract class RegularTopping - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class RegularTopping extends Topping
{
    public static int count = 0;
    static double cost = 0;
    static boolean flag = false;
    public abstract String getOrder();
}
