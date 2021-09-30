package javaxm3.sbww;

public class MyThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("线程名:"+Thread.currentThread().getName()+"--" +
                    "线程ID:"+Thread.currentThread().getId()+"---" +i);
        }
    }
}
