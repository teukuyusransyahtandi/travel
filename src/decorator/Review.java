package decorator;
public class Review extends PaketTour {

    public Review(Paket c) {
        super(c);
    }

    @Override
    public void tambah(){
        super.tambah();
        System.out.print(" Tambah Review Baru");
    }
}
