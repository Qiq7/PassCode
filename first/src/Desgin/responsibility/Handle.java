package Desgin.responsibility;

public abstract class Handle{
    protected final int one = 1;
    protected final int tree = 3;
    protected final  int seven = 7;


    private Handle next;
    private int start,end;

    public Handle(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void setNext(Handle next) {
        this.next = next;
    }
    public abstract void submit();

    public void handle(LeaveRequest leaveRequest){
        this.handle(leaveRequest);
        if (this.next!=null&&this.end<leaveRequest.getNum()){
            this.next.handle(leaveRequest);
        }else {
            System.out.println("处理完成！");
        }
    }

}
