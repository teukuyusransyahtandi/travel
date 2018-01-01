package decorator;

public class DecoratorPatternTest {

    public static void main(String[] args) {
        Paket review = new Review(new Lampuuk());
        review.tambah();
        System.out.println("\nProses tambah foto dan review sedang berlangsung ...");
        Paket reviewPhotoPaket = new Review(new Photo(new Lampuuk()));
        reviewPhotoPaket.tambah();
    }

}