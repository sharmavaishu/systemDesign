package systemDesign;


// o -> open closed principle open for extension and closed for modification.

// problematic code

class Invoice2Dao{

        Invoice1 invoice1;

        public Invoice2Dao(Invoice1 invoice1){
            this.invoice1 = invoice1;
        }

        // we have one method to save in to a db and suppose we want to save it in a different way like in file
        public void saveToDb(){
            System.out.println("save in database");
        }

        // this is the wrong way it impact already written functionality
        public void saveToFile(){
            System.out.println("save in file");
        }

}

// code follow the open/closed principle.
interface InvoiceSave{
   public void save(Invoice1 invoice1);
}

class saveToDatabase implements InvoiceSave{
    @Override
    public void save(Invoice1 invoice1) {
        System.out.println("save to db");
    }
}

class saveToFile implements InvoiceSave{
    @Override
    public void save(Invoice1 invoice1) {
        System.out.println("save to db");
    }
}

public class openClosedPrinciple {
    public static void main(String args[]){
        System.out.println("statement");
    }
}
