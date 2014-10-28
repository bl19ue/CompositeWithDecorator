package composite;


/**
 * Write a description of class RoastedGreenChillies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoastedGreenChillies extends RegularTopping
{
    Burger burger;
    public RoastedGreenChillies(Burger burger)
    {
        count++;
        this.burger = burger;
        if(count > 4)
        {
            cost += 0.75;
            flag = true;
        }
    }
    
    public String getOrder()
    {
        return burger.getOrder() + ", Roasted Green Chillies";
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
