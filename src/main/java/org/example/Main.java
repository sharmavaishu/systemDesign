package org.example;


// java oop implementation

// Encapsulation
class Book{

    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// Inheritance
class Member{
    void borrowBook(){
        System.out.println("book has been borrowed");
    }
}

class studentMember extends Member{
    void borrowBook() {
        System.out.println("Student borrowing book!");
    }
}

// Abstraction
abstract class Library{
    abstract void issueBook();
    abstract void returnBook();
}

class schoolLibrary extends Library{
    void issueBook() {
        System.out.println("Issuing book from School Library");
    }

    void returnBook() {
        System.out.println("Returning book to School Library");
    }
}

// Polymorphism
public class Main {
    public static void main(String[] args) {

        // Encapsulation
        Book book = new Book("java","james gosling");
        System.out.println("Title" + book.getTitle());

        // Inheritance
        Member student = new studentMember();
        student.borrowBook();

        // Abstraction
        Library library = new schoolLibrary();
        library.issueBook();
        library.returnBook();

        // PolyMorphism
        Library collegeLibrary = new schoolLibrary();
        collegeLibrary.issueBook();

    }
}



