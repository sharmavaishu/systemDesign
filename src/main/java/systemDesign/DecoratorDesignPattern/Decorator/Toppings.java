package systemDesign.DecoratorDesignPattern.Decorator;

import systemDesign.DecoratorDesignPattern.BasePizza;

public abstract class Toppings extends BasePizza {

}

// note - Decortor pattern is used to avoid class exploison and it did not break any previous func.
// only add on new on the previous base functionality.
