package Desgin.strategy;

    public class Events {
    strategy plane;
    Events(strategy plane){
        this.plane = plane;
    }
    public void show(){
        plane.Strategy();
    }
}
