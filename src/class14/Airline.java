package class14;

public class Airline {
    double PAYMENT = 3000;
        public String name = "bestAirline";
        protected String airlineType;
    public String custName;
    int numPass;
    public String destinationCountry;
    public String datesOfFlight;

    public void searchInfo(String custName, int numPass, String destinationCountry, String datesOfFlight){
        System.out.println("Result: " + " customer name " + custName + " number of passenger" + '\'' +
                numPass + " Destination: " + destinationCountry + " Dates of flight " + datesOfFlight);

    }




        public void flyToNewYork() {
            System.out.println("Choose what airline you like: Hawaiian or Delta");
        }
        public void flyToFrance(){
            System.out.println("Choose what airline you like: Hawaiian or Delta");
        }
        public void isThereAnyDelay(){
            System.out.println("See the airline schedule");
    }
   void PAYMENT() {
       if (PAYMENT >= 4000 && PAYMENT <= 10000) {
           System.out.println("Choose the first class of: Delta or Hawaii");
       } else if (PAYMENT >= 3000 && PAYMENT <= 3999) {
           System.out.println("Choose the business class of: Delta or Hawaii");
       } else if (PAYMENT >= 2000 && PAYMENT <= 2999) {
           System.out.println("Choose the economy class of: Delta or Hawaii");
       } else if (PAYMENT >= 1000 && PAYMENT <= 999) {
           System.out.println("Choose the airline you like to you use your discount: Delta or Hawaii");
       } else {
           System.out.println("Your payment didn't go through");
       }
   }
}
