package systemDesign.DecoratorDesignPattern.Decorator;

import systemDesign.DecoratorDesignPattern.BasePizza;

public class Mushrooms extends Toppings{

    BasePizza basePizza;

    Mushrooms(BasePizza basePizza1){
        this.basePizza = basePizza1;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+10;
    }
}
