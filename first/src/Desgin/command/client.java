package Desgin.command;


public class client {
    public static void main(String[] args) {
        Order order = new Order();
        order.Order(1).setMenu("aaa",1)
        .setMenu("bbb",2)
        .setMenu("cccc",3);

        Order order1 = new Order();
        order1.Order(2).setMenu("qqq",1)
                .setMenu("wwww",2)
                .setMenu("eee",3);
        OrderCommand orderCommand = new OrderCommand(new Chef(),order);
        OrderCommand orderCommand1 = new OrderCommand(new Chef(),order1);

        waiter waiter = new waiter();
        waiter.setList(orderCommand);
        //waiter.orderUp();

        waiter.setList(orderCommand1);
        waiter.orderUp();
    }
}
