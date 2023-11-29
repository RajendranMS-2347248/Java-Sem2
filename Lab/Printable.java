package lab4;


    // Define an interface named Printable
interface Printable {
    void print();  // Abstract method
}

// Implement the Printable interface in a class named Document
class Document implements Printable {
    private String content;

    // Constructor
    public Document(String content) {
        this.content = content;
    }

    // Implement the print method from the Printable interface
    @Override
    public void print() {
        System.out.println("Printing document: " + content);
    }
}

// Another class that implements the Printable interface
class Photo implements Printable {
    private String description;

    // Constructor
    public Photo(String description) {
        this.description = description;
    }

    // Implement the print method from the Printable interface
    @Override
    public void print() {
        System.out.println("Printing photo: " + description);
    }
}

// Main class to demonstrate the use of interfaces



