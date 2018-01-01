package observer;

import java.util.ArrayList;

public class DataPaket implements Subject {
    private ArrayList<Observer> observers;
    private String namaPaket;
    private float harga;
    private String deskripsi;

    public DataPaket() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(namaPaket, harga, deskripsi);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(String namaPaket, float harga, String deskripsi) {
        this.namaPaket = namaPaket;
        this.harga = harga;
        this.deskripsi = deskripsi;
        measurementsChanged();
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public float getHarga() {
        return harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

}
