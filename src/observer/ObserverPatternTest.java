package observer;

public class ObserverPatternTest {

    public static void main(String[] args) {
        DataPaket dataPaket = new DataPaket();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(dataPaket);
        SmartphoneDisplay smartphoneDisplay = new SmartphoneDisplay(dataPaket,"zenfone");
        SmartphoneDisplay smartphoneDisplay2 = new SmartphoneDisplay(dataPaket,"xiaomi");
        SmartphoneDisplay smartphoneDisplay3 = new SmartphoneDisplay(dataPaket,"iphone");
        dataPaket.setMeasurements("Paket Tahun Baru Masehi", 70000, "Paket yang hanya ada di malam tahun baru !");
        dataPaket.setMeasurements("Paket valentine", 100000, "Paket bagi kamu yang suka makan ena ena!");


    }
}
