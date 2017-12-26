package decorator;

public class Photo extends PaketTour {

    public Photo(Paket c) {
        super(c);
    }

    @Override
    public void tambah(){
        super.tambah();
        System.out.print(" Tambah Foto Baru.");
    }
}