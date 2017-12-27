package decorator;

public class PaketPremium extends Paket {

    public PaketPremium() {
        this.description = "Paket Premium";
    }

    @Override
    public double price() {
        return 500000;
    }
}