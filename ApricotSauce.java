package composite;


/**
 * Write a description of class ApricotSauce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ApricotSauce extends Sauce
{
    Burger burger;
    public ApricotSauce(Burger burger)
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
        return burger.getOrder() + ", Apricot Sauce";
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
