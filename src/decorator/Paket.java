package decorator;

public abstract class Paket {
    String description = "Basic Paket";
    String reviews = "";
    String photos = "";

    public String getDescription() {
        return description;
    }

    public String getReview(){
        String result = "List review :\n"+reviews;
        result += "----------------------------";
        return result;
    };
    public String getPhoto(){
        String result = "List foto :\n"+photos;
        result += "----------------------------";
        return result;
    };

    public void addReview(String nama, String comment){
        this.reviews += nama + " : " + comment + "\n";
    }
    public void addPhoto(String namaFile){
        this.photos += namaFile + "\n";
    }

    public abstract double price();
}