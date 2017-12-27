package decorator;

public abstract class Paket {
    String description = "Basic Paket";

    public String getDescription() {
        return description;
    }

    public abstract double price();
}