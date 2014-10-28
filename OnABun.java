package composite;


/**
 * Write a description of class OnABun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OnABun extends BunOrBowl
{
    Burger burger;
    
    public OnABun(Burger burger)
    {
        this.burger = burger;
    }
    
    public String getOrder()
    {
        return burger.getOrder() + ", On a Bun";
    }
    
    public double cost()
    {
        return burger.cost();
    }
}
