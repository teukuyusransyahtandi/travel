package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private String namaPaket;
    private float harga;
    private Subject dataPaket;

    public CurrentConditionsDisplay(Subject dataPaket) {
        this.dataPaket = dataPaket;
        dataPaket.registerObserver(this);
    }

    public void update(String namaPaket, float harga, String deskripsi) {
        this.namaPaket = namaPaket;
        this.harga = harga;
        //display();
    }

    public void display() {
        System.out.println("Hadir Paket Terbaru ! : " + namaPaket
                + " dengan harga " + harga + "rupiah");
    }
}