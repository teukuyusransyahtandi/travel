package decorator;
public abstract class Review {
    String nama = "";
    String comment = "";

    public String getReviews() {
        return null;
    }

    public void tambahReview(String nama, String comment) {
        this.nama = nama;
        this.comment = comment;
    }
}
