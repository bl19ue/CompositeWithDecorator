package composite;


/**
 * Write a description of class SoftRipenedBrie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoftRipenedBrie extends Cheese
{
    Burger burger;
    public SoftRipenedBrie(Burger burger)
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
        return burger.getOrder() + ", Soft Ripened Brie";
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
