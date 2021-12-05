package Desgin.command;

import java.util.Map;

public class OrderCommand implements Commend {

    Chef chef;
    Order order;

    OrderCommand(Chef chef,Order order){
        this.chef=chef;
        this.order=order;
    }
    @Override
    public void execute() {
        System.out.println("table number :"+order.getTable());
        for (Map.Entry x:order.getMenu().entrySet()) {
            System.out.println("make"+x.getValue()+"  ==="+x.getKey());
        }
    }
}
