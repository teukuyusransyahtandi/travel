package observer;

//import java.util.*;

public class SmartphoneDisplay implements Observer, DisplayElement {
    private String deskripsi = "deskripsi paket";
    private String deskripsiAkhir;
    private DataPaket dataPaket;
    private String namaHape;


    public SmartphoneDisplay(DataPaket dataPaket, String namaHape) {
        this.dataPaket = dataPaket;
        this.namaHape = namaHape;
        dataPaket.registerObserver(this);
    }

    public void update(String namaPaket, float harga, String deskripsi) {
        deskripsiAkhir = namaPaket+"\n";
        deskripsiAkhir +="hanya dengan harga Rp" +harga+"\n";
        deskripsiAkhir += deskripsi+"\n";
        deskripsiAkhir += "-----------------------------------------";

        display();
    }

    public void display() {
        System.out.println("Notifikasi Paket di handphone "+namaHape);
        System.out.println(deskripsiAkhir);
    }
}
