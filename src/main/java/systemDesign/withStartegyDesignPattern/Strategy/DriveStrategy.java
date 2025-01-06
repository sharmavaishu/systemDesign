package systemDesign.withStartegyDesignPattern.Strategy;


public interface DriveStrategy {
   public void drive();
}

// what problem did strategy design pattern solve ?
// ans - if one or more child use the same property rather than using its base class prp. then
// there is a high chance of code duplicacy and scalability issue to solve this strategy ptt. use
// and we design an interface and method to implement that interface which is used by child classes as per constructor injection