package composite;


/**
 * Write a description of class HoneyMustard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HoneyMustard extends Sauce
{
    Burger burger;
    public HoneyMustard(Burger burger)
    {
        count++;
        this.burger = burger;
        if(count > 1)
        {
            cost += 1.0;
            flag = true;
        }
    }
    
    public String getOrder()
    {
        return burger.getOrder() + ", Honey Mustard";
    }
    
    public double cost()
    {
        if(flag)
        {
            flag = false;
            double temp_cost = cost;
            cost = 0;
            return burger.cost() + temp_cost;
        }
        else
            return burger.cost();
    }
}
