package systemDesign.DecoratorDesignPattern.Decorator;

import systemDesign.DecoratorDesignPattern.BasePizza;

public class ExtraCheese extends Toppings{
    BasePizza basePizza;

    ExtraCheese(BasePizza basePizza1){
        this.basePizza = basePizza1;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+25;
    }
}
