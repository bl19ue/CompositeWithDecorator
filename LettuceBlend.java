package composite;


/**
 * Write a description of class LettuceBlend here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LettuceBlend extends InABowl
{
    Burger burger;
    
    public LettuceBlend(Burger burger)
    {
        this.burger = burger;
    }
    
    public String getOrder()
    {
        return burger.getOrder() + ", In a bowl - Lettuce Blend";
    }
    
    public double cost()
    {
        return burger.cost() + 1.0;
    }

    
}
