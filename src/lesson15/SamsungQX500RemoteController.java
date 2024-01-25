package lesson15;

public class SamsungQX500RemoteController extends SamsungTV implements RemoteController, FireStick{
    // If you are extending and implementing, then extend class should be first, then implement interface as second
    // Only one class can be extended, but multiple interfaces can be implemented
    @Override
    public void turnOn() {
        System.out.println("Turn on the QX TV and show all the applications available ");
    }
        @Override
                public void turnOff(){
            System.out.println("Close all running applications and then turn off");
        }
        @Override
                public int moveUp(int steps){
            System.out.println(steps);

            return steps;
        }

    @Override
    public void turnOnAmazonApp() {

    }

    @Override
    public void turnOffAmazonApp() {

    }

    @Override
    public void openPrimeVideos() {

    }

    @Override
    public void abstractMethod() {
        // some implementation of abstract method
    }
}

