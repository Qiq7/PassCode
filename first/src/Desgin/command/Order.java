package Desgin.command;

import java.util.HashMap;
import java.util.Map;

public class Order {
    int table;
    Map<String,Integer> menu = new HashMap<>();

     Order(){};
     Order Order (int table){
        this.table = table;
        return this;
    }

    public Order setMenu(String s, int num) {
        this.menu.put(s,num);
        return this;
    }
    public Map<String, Integer> getMenu() {
        return menu;
    }

    public int getTable() {
        return table;
    }
}
