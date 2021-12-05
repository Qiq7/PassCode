package Desgin.template;

abstract public class Template {
    public void step0(){
        System.out.println("0");
    }
    public void step1(){
        System.out.println("1");
    }
    abstract public void step();
    final public void process(){
        this.step0();
        this.step1();
        this.step();
        System.out.println("==========================");
    };
}
