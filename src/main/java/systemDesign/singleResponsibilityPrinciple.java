package systemDesign;

// S - Single Responsibility Principle
// A class should have only one reason to change.
// Easy to maintain and understand.
class Marker{
    int price;
    String color;

    public Marker(int price,String color){
        this.price = price;
        this.color = color;
    }
}

// problematic code

class Invoice{
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker1,int quantity){
        this.marker = marker1;
        this.quantity = quantity;
    }

    // this class has 3 reason to change 1 is for price suppose I am adding the gst or discount method
    public int calculateTotal(){
        return marker.price*quantity;
    }

    // that can also be change
    public void printStatement(){
        System.out.println("print statement");
    }

    // same for db
    public void saveToDb(){
        System.out.println("save in database");
    }

}


// code follow s-> single Responsibility

class Invoice1 {
    private Marker marker;
    private int quantity;

    public Invoice1(Marker marker1, int quantity) {
        this.marker = marker1;
        this.quantity = quantity;
    }

    // this class has 3 reason to change 1 is for price suppose I am adding the gst or discount method
    public int calculateTotal() {
        return marker.price * quantity;
    }
}

// print invoice ka nikalenge na
class Invoice1Dao{

    Invoice1 invoice1;

    public Invoice1Dao(Invoice1 invoice1){
        this.invoice1 = invoice1;
    }

    public void saveToDb(){
        System.out.println("save in database");
    }
}
// all the classes have only one reason to change.
class Invoice1Printer{
    Invoice1 invoice1;

    public Invoice1Printer(Invoice1 invoice1){
        this.invoice1 = invoice1;
    }

    public void printStatement(){
        System.out.println("print statement");
    }
}

public class singleResponsibilityPrinciple {
    public static void main (String args[]){
        System.out.println("something");
    }
}
