package systemDesign;

// I-> Interface Segmented Principle.
// Interfaces should be such, client should not implement unnecessary func. they do not need.

// Problematic code
interface RestaurentEmployee{
    void serveFood();
    void washUtensils();
    void pickOrder();
    void orderDeleiver();
    void cookFood();
    void menuDecide();
}

class waiter implements RestaurentEmployee{
   public void serveFood(){

    }
   public void washUtensils(){

    }
   public void pickOrder(){

    }
    public void orderDeleiver(){

    }

    @Override
    // no usage bec waiter don't cook food
    public void cookFood() {

    }
    // no usage bec waiter don't decide menu
    @Override
    public void menuDecide() {

    }
}

// approach to solve this

interface waiterClass{
    void serveFood();
    void washUtensils();
    void pickOrder();
    void orderDeleiver();
}

interface chefClass{
    void cookFood();
    void menuDecide();
}

class waiter1 implements  waiterClass{
    @Override
    public void serveFood() {

    }

    @Override
    public void pickOrder() {

    }

    @Override
    public void washUtensils() {

    }

    @Override
    public void orderDeleiver() {

    }
}

class chef1 implements chefClass{
    @Override
    public void cookFood() {

    }

    @Override
    public void menuDecide() {

    }
}
public class InterfaceSegmentedPrinciple {
}
