package composite;


/**
 * Write a description of class OneThird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OneThird extends Quantity
{
    Burger burger;
    
    public OneThird(Burger burger)
    {
        this.burger = burger;
    }
    
    public String getOrder()
    {
        return burger.getOrder() + ", 1/3lb";
    }
    
    public double cost()
    {
        return burger.cost() + 9.50; 
    }
}
