package lab3;

public class lab3 {
    // Base class representing a chemical
abstract class Chemical {
    String name;

    Chemical(String name) {
        this.name = name;
    }

    abstract void displayInfo();
}

// Derived class representing a specific type of chemical: Element
class Element extends Chemical {
    String symbol;

    Element(String name, String symbol) {
        super(name);
        this.symbol = symbol;
    }

    // Override the displayInfo method
    @Override
    void displayInfo() {
        System.out.println("Element: " + name + " (" + symbol + ")");
    }
}

// Derived class representing another type of chemical: Compound
final class Compound extends Chemical {
    String formula;

    Compound(String name, String formula) {
        super(name);
        this.formula = formula;
    }

    // Override the displayInfo method
    @Override
    void displayInfo() {
        System.out.println("Compound: " + name + " (" + formula + ")");
    }
}

// Main class to demonstrate the concept
public class ChemicalEngineeringDemo {
    public static void main(String[] args) {
        Element oxygen = new Element("Oxygen", "O");
        Compound water = new Compound("Water", "H2O");

        // Demonstrate inheritance and polymorphism
        Chemical[] chemicals = {oxygen, water};
        for (Chemical chemical : chemicals) {
            chemical.displayInfo();
        }
    }
}

}
