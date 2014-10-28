package composite;


/**
 * Write a description of class TwoThird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TwoThird extends Quantity
{
    Burger burger;
    
    public TwoThird(Burger burger)
    {
        this.burger = burger;
    }
    
    public String getOrder()
    {
        return burger.getOrder() + ", 2/3lb";
    }
    
    public double cost()
    {
        return burger.cost() + 11.50; 
    }
}
