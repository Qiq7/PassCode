package javaxm3.sbww;

public class MyThread extends Thread{
    private int Kick =5;

    public MyThread() {
    }
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        while (true)
        {
            if(Kick<0) break;
            System.out.println("线程名:"+Thread.currentThread().getName()+
                    "线程Id:"+Thread.currentThread().getId()+"剩余"+Kick+"张票");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Kick--;
        }
    }
}
