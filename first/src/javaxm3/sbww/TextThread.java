package javaxm3.sbww;

public class TextThread {
    public static void main(String[] args) {
        MyThread a=new MyThread("hhh");
        MyThread b=new MyThread();
        a.start();
        b.start();
        MyThread1 d=new MyThread1();
        Thread c=new Thread(d,"xixixi");
        c.start();
        Runnable e=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("线程名:"+Thread.currentThread().getName()+"" +
                            "线程ID:"+Thread.currentThread().getId()+"----"+i);
                }
            }
        };
        Thread f=new Thread(e,"oooooo");
        f.start();
    }

}
