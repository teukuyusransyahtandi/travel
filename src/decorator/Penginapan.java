package decorator;

public class Penginapan extends PaketDecorator {
    Paket paket;

    public Penginapan(Paket paket) {
        this.paket = paket;
    }

    @Override
    public String getDescription() {
        return paket.getDescription()+", Penginapan";
    }

    @Override
    public double price() {
        return paket.price()+1000000;
    }
}
