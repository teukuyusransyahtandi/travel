package decorator;

public class PaketBiasa extends Paket {

    public PaketBiasa() {
        this.description = "Paket Biasa";
    }

    @Override
    public double price() {
        return 100000;
    }
}