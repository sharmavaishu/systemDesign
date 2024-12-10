package systemDesign;

// The Dependency Inversion Principle (DIP) states that high-level modules should not depend on low-level modules;
// both should depend on abstractions. Abstractions should not depend on details. Details should depend upon abstractions.
// Class should depend on interfaces rather then concrete class

interface databaseOperation{
    void saveFileToDb();
    void addElement();
    void removeElement();
}

class MySql implements databaseOperation{
    @Override
    public void addElement() {

    }

    @Override
    public void removeElement() {

    }

    @Override
    public void saveFileToDb() {

    }
}

class MongoDb implements  databaseOperation{
    @Override
    public void addElement() {

    }

    @Override
    public void removeElement() {

    }

    @Override
    public void saveFileToDb() {

    }
}
public class DependencyInversionPrinciple {
}
