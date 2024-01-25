package lesson15;

public interface RemoteController {
    //Interface is a contract that requires any implementing class to add method implementation
    // Interface rules:
    // 1. Methods must be public
    // 2. Only method signature is specified
    // 3. Only public static final variables are allowed
    public static final double PI = 3.14;
    void turnOn();
    void turnOff();
    int moveUp(int steps);



}
