package lab4;

public class InterfaceExample {
    public static void main(String[] args) {
        // Create instances of classes that implement the Printable interface
        Printable document = new Document("Sample document content");
        Printable photo = new Photo("Beautiful sunset");

        // Call the print method on each object
        document.print();
        photo.print();
    }
}
