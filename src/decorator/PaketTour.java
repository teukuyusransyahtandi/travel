package decorator;

public class PaketTour implements Paket {

    protected Paket car;

    public PaketTour(Paket c){
        this.car=c;
    }

    @Override
    public void tambah() {
        this.car.tambah();
    }

}