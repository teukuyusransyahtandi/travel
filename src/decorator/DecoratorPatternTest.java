package decorator;

public class DecoratorPatternTest {

    public static void main(String[] args) {
        Paket paket1 = new PaketBiasa();
        paket1 = new Transportasi(paket1);
        paket1.addPhoto("haha.jpg");
        paket1.addPhoto("haha2.jpg");

        paket1.addReview("anonim", "paketnya jelek ga bagus :p");
        paket1.addReview("yusran", "paketnya jelek ga bagus :p");

        System.out.println(paket1.getDescription());
        System.out.println(paket1.getReview());
        System.out.println(paket1.getPhoto());
//        System.out.println("\nProses tambah foto dan review sedang berlangsung ...");
//
//        PaketDecorator reviewPhotoPaket = new Review(new Photo(new Lampuuk()));
//        reviewPhotoPaket.tambah();
    }

}