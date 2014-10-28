package composite;


/**
 * Write a description of class OneWhole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OneWhole extends Quantity
{
    Burger burger;
    
    public OneWhole(Burger burger)
    {
        this.burger = burger;
    }
    
    public String getOrder()
    {
        return burger.getOrder() + ", 1 lb";
    }
    
    public double cost()
    {
        return burger.cost() + 15.50; 
    }
}
