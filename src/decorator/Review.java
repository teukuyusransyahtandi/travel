package decorator;
public class Review {
    String nama = "";
    String comment = "";
    Paket paket;

    public Review(Paket paket) {
        this.paket=paket;
    }

    public String getReviews() {
        return null;
    }

    public void tambahReview(String nama, String comment) {
        this.nama = nama;
        this.comment = comment;
    }
}
