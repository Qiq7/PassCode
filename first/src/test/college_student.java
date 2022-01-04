package test;

public class college_student extends Student{
    private float chinese;
    private float math;
    private float computer;
    float total_score(){
        return this.chinese+this.computer+this.computer;
    }

    public college_student(int num, String name, String sex, float chinese, float math, float computer) {
        super(num, name, sex);
        this.chinese = chinese;
        this.math = math;
        this.computer = computer;
    }

    @Override
    public String toString() {



        return "(" +super.toString()+","
                + chinese +","+
               + math +","
                + computer+"," +this.total_score()+")";
    }
}
