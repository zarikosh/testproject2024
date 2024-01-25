package class14;

public class MainAirline {
    public static void main(String[] args) {
        Airline airline = new Airline();
        airline.flyToNewYork();

        Delta delta = new Delta();
        delta.flyToNewYork();

        Hawaiian hawaiian = new Hawaiian();
        hawaiian.flyToFrance();

        hawaiian.isThereAnyDelay();
        delta.isThereAnyDelay();

        delta.flyToFrance();
        airline.isThereAnyDelay();
        delta.searchInfo("Zarina Spandiyarova", 5, "NYC-HWI", "01.12.24-02.07.24" );
        hawaiian.PAYMENT();

    }
}
