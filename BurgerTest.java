package composite;


/**
 * Write a description of class BurgerTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BurgerTest
{
    public static void main(String args[])
    {
        Burger burger = new Beef();
        
        burger = new TwoThird(burger);
        
        burger = new LettuceBlend(burger);
        
        burger = new Scallions(burger);
        burger = new Scallions(burger);
        burger = new Scallions(burger);
        burger = new Scallions(burger);
        burger = new RoastedGreenChillies(burger);
        
        burger = new Chili(burger);
        
        burger = new ClassicCaesar(burger);
        System.out.println(burger.getOrder() + " " + burger.cost());
        
        
        burger = new GrilledPineapple(burger);
        burger = new BlackOlives(burger);
        
        burger = new HoneyMustard(burger);
        
        System.out.println(burger.getOrder() + " " + burger.cost());
    }
}
