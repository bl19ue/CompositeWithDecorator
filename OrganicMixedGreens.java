package composite;

public class OrganicMixedGreens extends InABowl
{
    Burger burger;
    
    public OrganicMixedGreens(Burger burger)
    {
        this.burger = burger;
    }
    
    public String getOrder()
    {
        return burger.getOrder() + ", In a bowl - Organic Mixed Greens";
    }
    
    public double cost()
    {
        return burger.cost() + 1.0;
    }
    
}
