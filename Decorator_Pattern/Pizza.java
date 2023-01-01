package Decorator_Pattern;

abstract class BasePizza {
    public abstract int cost();
}

class FarmHouse extends BasePizza
{

    @Override
    public int cost() {
        return 200;
    }
    
}

class VegDelight extends BasePizza{
    @Override
    public int cost()
    {
        return 120;
    }
}

class Margherita extends BasePizza{
    @Override
    public int cost()
    {
        return 100;
    }
}


abstract class ToppingDecorator extends BasePizza{

} 


class ExtraCheese extends ToppingDecorator{


    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza)
    {
        basePizza = pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }

}

class Mushroom extends ToppingDecorator{


    BasePizza basePizza;

    public Mushroom(BasePizza basePizza)
    {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        
        return this.basePizza.cost() + 20;
    }

}




public class Pizza {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new Margherita()));

        System.out.println(pizza.cost());
    }
}
