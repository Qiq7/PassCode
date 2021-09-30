package javaxm2.sbww.study;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashMap {
    private class pair{
        private int key,value;
        public pair(int key,int value)
        {
            this.key=key;
            this.value=value;
        }

        public int getKey() {
            return key;
        }
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }
    private static final int BASE = 769;
    private LinkedList[] data;
    public MyHashMap()
    {
        data = new LinkedList[BASE];
        for (int i = 0; i < BASE; i++) {
            data[i] = new LinkedList<pair>();
        }
    }
    public void put(int key,int value)
    {
        int n =hash(key);
        Iterator<pair> it = data[n].iterator();
        while (it.hasNext())
        {
            pair p = it.next();
            if(p.getKey()==key)
            {
                p.setValue(value);
                return;
            }
        }
        data[n].offerLast(new pair(key,value));
    }
    public int get(int key)
    {
        int n = hash(key);
        Iterator<pair> it=data[n].iterator();
        while (it.hasNext())
        {
            pair p=it.next();
            if(p.getKey()==key)
            {
                return p.getValue();
            }
        }
        return -1;
    }
    public void remove(int key)
    {
        int n = hash(key);
        Iterator<pair> it=data[n].iterator();
        while (it.hasNext())
        {
            pair p=it.next();
            if(p.getKey()==key)
            {
                data[n].remove(p);
                return;
            }
        }
        return;
    }
    public int hash(int key)
    {
        return key%BASE;
    }
}
