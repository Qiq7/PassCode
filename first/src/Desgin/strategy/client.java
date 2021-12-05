package Desgin.strategy;


public class client {
    public static void main(String[] args) {
        plane plane0 = new plane();
        planeB planeb = new planeB();
        Events events = new Events(plane0);
        Events events1 = new Events(planeb);
        events.show();
        events1.show();
    }
}
