package systemDesign;

// L -> LiskovSubstitute Principle -> If Class B is a subtype of Class A then we should be able to
// replace object of A with B without breaking the behaviour of Program.

// subclass should extend the capability of parent class not narrow it down.

// problematic code
interface Bike{
    void turnOnEngine();
    void speed();
}

class yamahaBike implements Bike{
    @Override
    public void turnOnEngine() {
        System.out.println("engine start in 1s..");
    }

    @Override
    public void speed() {
        System.out.println("Speed can be 120km/hr");
    }
}

// narrow down the parent properties.
class heroCycle implements Bike{
    @Override
    public void turnOnEngine() {
        throw new AssertionError("Hero Cycle don't have the engine");
    }

    @Override
    public void speed() {
        System.out.println("depends on your potential");
    }
}
public class LiskovSubstitutePrinciple {
}
