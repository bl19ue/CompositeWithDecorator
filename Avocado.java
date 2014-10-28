package composite;


/**
 * Write a description of class Avocado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avocado extends PremiumTopping
{
    Burger burger;
    public Avocado(Burger burger)
    {
        this.burger = burger;
    }
    
    public String getOrder()
    {
        return burger.getOrder() + ", Avocado";
    }
    
    public double cost()
    {
        return burger.cost() + 1.50;
    }
}
