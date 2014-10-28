package composite;


/**
 * Write a description of class FriedEgg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FriedEgg extends PremiumTopping
{
    Burger burger;
    public FriedEgg(Burger burger)
    {
        this.burger = burger;
    }
    
    public String getOrder()
    {
        return burger.getOrder() + ", Fried Egg";
    }
    
    public double cost()
    {
        return burger.cost() + 1.50;
    }
}
