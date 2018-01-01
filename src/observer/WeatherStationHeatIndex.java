package observer;

public class WeatherStationHeatIndex {

    public static void main(String[] args) {
        DataPaket dataPaket = new DataPaket();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(dataPaket);
        SmartphoneDisplay smartphoneDisplay = new SmartphoneDisplay(dataPaket,"");
        dataPaket.setMeasurements("Paket Tahun Baru Masehi", 70000, "Paket yang hanya ada di malam tahun baru !");
    }
}
