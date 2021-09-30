package javaxm3.sbww;

import java.util.PriorityQueue;

public class MedianFinder {

    private PriorityQueue<Integer> qmi;
    private PriorityQueue<Integer> qma;
    public MedianFinder() {
        qmi = new PriorityQueue<>((a,b)->(b-a));
        qma = new PriorityQueue<>((a,b)->(a-b));
    }

    public void addNum(int num) {
        if(qmi.isEmpty()||num<=qmi.peek())
        {
            qmi.offer(num);
            if(qma.size()+1<qmi.size())
            {
                qma.offer(qmi.poll());
            }
        }else {
            qma.offer(num);
            if(qma.size()>qmi.size())
            {
                qmi.offer(qma.poll());
            }
        }
    }

    public double findMedian() {
        if(qmi.size()>qma.size())
        {
            return qmi.peek();
        }
        return (qmi.peek()+qma.peek())/2;
    }
}
