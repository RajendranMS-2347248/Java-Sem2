package Lab;

public class ChemicalCompound {
    // Data members (attributes)
    private String name;
    private double molecularWeight;
    private String formula;

    // Default constructor
    public ChemicalCompound() {
        name = "Unknown";
        molecularWeight = 0.0;
        formula = "N/A";
    }

    // Constructor overloading (1)
    public ChemicalCompound(String name, double molecularWeight, String formula) {
        this.name = name;
        this.molecularWeight = molecularWeight;
        this.formula = formula;
    }

    // Constructor overloading (2)
    public ChemicalCompound(String name, double molecularWeight) {
        this(name, molecularWeight, "N/A");
    }

    // Method overloading (1)
    public void displayInfo() {
        System.out.println("Compound: " + name);
        System.out.println("Molecular Weight: " + molecularWeight + " g/mol");
        System.out.println("Formula: " + formula);
    }

    // Method overloading (2)
    public void displayInfo(boolean detailed) {
        if (detailed) {
            System.out.println("Compound Name: " + name);
            System.out.println("Molecular Weight: " + molecularWeight + " g/mol");
            System.out.println("Chemical Formula: " + formula);
        } else {
            System.out.println("Compound: " + name);
        }
    }

    // Method overloading (3)
    public void displayInfo(int precision) {
        System.out.printf("Compound: %s%nMolecular Weight: %.2f g/mol%nFormula: %s%n", name, molecularWeight, formula);
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(double molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public static void main(String[] args) {
        ChemicalCompound unknownCompound = new ChemicalCompound();
        unknownCompound.displayInfo();

        ChemicalCompound water = new ChemicalCompound("Water", 18.01528, "H2O");
        water.displayInfo(true);

        ChemicalCompound oxygen = new ChemicalCompound("Oxygen", 32.00);
        oxygen.displayInfo(2);
    }
}

