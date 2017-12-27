package decorator;

public class Transportasi extends PaketDecorator {
    Paket paket;

    public Transportasi(Paket paket) {
        this.paket = paket;
    }

    @Override
    public String getDescription() {
        return paket.getDescription()+", Transportasi";
    }

    @Override
    public double price() {
        return paket.price()+50000;
    }
}
