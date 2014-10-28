package composite;


/**
 * Write a description of class HorseradishCheddar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HorseradishCheddar extends Cheese
{
    Burger burger;
    public HorseradishCheddar(Burger burger)
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
        return burger.getOrder() + ", Horseradish Cheddar";
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
