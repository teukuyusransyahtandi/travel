package decorator;

public class DecoratorPatternTest {

    public static void main(String[] args) {
        Paket paket1 = new PaketBiasa();
        paket1 = new Transportasi(paket1);
        System.out.println(paket1.getDescription());
//        System.out.println("\nProses tambah foto dan review sedang berlangsung ...");
//
//        PaketDecorator reviewPhotoPaket = new Review(new Photo(new Lampuuk()));
//        reviewPhotoPaket.tambah();
    }

}