package Desgin.command;

import java.util.LinkedList;
import java.util.List;

public class waiter {
    List<Commend> list = new LinkedList<>();

    public void setList(Commend cm) {
        list.add(cm);
    }

    public void orderUp(){
        System.out.println(list.size());
        for (Commend c:list) {
            if (c!=null){
                c.execute();
                this.list.remove(0);
            }
        }
        System.out.println(list.size());
    }

}
