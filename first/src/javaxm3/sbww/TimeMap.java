package javaxm3.sbww;

import java.util.*;

public class TimeMap {
    class pair{
        private String value;
        private int timestamp;
        pair(String value,int timestamp)
        {
            this.value = value;
            this.timestamp = timestamp;
        }

        @Override
        public boolean equals(Object o) {
            if(o instanceof pair)
            {
                return ((pair) o).timestamp==this.timestamp&&((pair) o).value==this.value;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.timestamp+this.value.hashCode();
        }

        public int compareTo(pair pair2)
        {
            if(this.timestamp!=pair2.timestamp)
            {
                return this.timestamp - pair2.timestamp;
            }else {
                return this.value.compareTo(pair2.value);
            }
        }
    }
    private Map<String, List<pair>> m ;
    public TimeMap() {
        m = new HashMap<>();
    }
    public void set(String key, String value, int timestamp) {
        List<pair> p = m.getOrDefault(key,new LinkedList<>());
        p.add(new pair(value,timestamp));
        m.put(key,p);
    }
    public String get(String key, int timestamp) {
        pair p = new pair(String.valueOf((char)127),timestamp);
        int i = f(m.getOrDefault(key,new LinkedList<>()),p);
        if(i>0)
        {
            return m.get(key).get(i-1).value;
        }
        return "";
    }
    public int f(List<pair> lp,pair p)
    {
        int low = 0, high = lp.size() - 1;
        if (high < 0 || lp.get(high).compareTo(p) <= 0) {
            return high + 1;
        }
        while (low < high) {
            int mid = (high - low) / 2 + low;
            pair pair = lp.get(mid);
            if (pair.compareTo(p) <= 0) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

}
