package composite;


/**
 * Write a description of class Chili here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chili extends PremiumTopping
{
    Burger burger;
    public Chili(Burger burger)
    {
        this.burger = burger;
    }
    
    public String getOrder()
    {
        return burger.getOrder() + ", Chili";
    }
    
    public double cost()
    {
        return burger.cost() + 1.50;
    }
}
