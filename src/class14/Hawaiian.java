package class14;

public class Hawaiian extends Airline{
    double PAYMENT = 3000;
    public String name = "HawaiianAirlines";
    protected String airplaneModel;
    public String custName;
    int numPass;
    public String destinationCountry;
    public String datesOfFlight;

    public void searchInfo(String custName, int numPass, String destinationCountry, String datesOfFlight){
        System.out.println(" Result: " + " customer name " + custName + " number of passenger" + '\'' +
                numPass + " Destination: " + destinationCountry + " Dates of flight " + datesOfFlight);

    }
    @Override
    public void flyToNewYork() {
        System.out.println("Flying Airbus A330");
    }
    public void flyToFrance(){
        System.out.println("Airbus A321");
    }
    public void isThereAnyDelay(){
        System.out.println("The flight is operated as planned");
    }
    void PAYMENT() {
        if (PAYMENT >= 4000 && PAYMENT <= 10000) {
            System.out.println("Your ticket in first class is purchased successfully");
        } else if (PAYMENT >= 3000 && PAYMENT <= 3999) {
            System.out.println("Your ticket in business class is purchased successfully");
        } else if (PAYMENT >= 2000 && PAYMENT <= 2999) {
            System.out.println("Your ticket in economy class is purchased successfully");
        } else if (PAYMENT >= 1000 && PAYMENT <= 999) {
            System.out.println("The discount applied and your ticket is booked");
        } else {
            System.out.println("Your payment didn't go through");
        }
    }
}
