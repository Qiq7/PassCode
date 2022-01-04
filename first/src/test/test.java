package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        college_student[] arrays = new college_student[5];
        arrays[0] = new college_student(1001,"小明","男",80,85,87);
        arrays[1] = new college_student(1002,"小红","女",89,89,97);
        arrays[2] = new college_student(1003,"小刚","男",90,95,97);
        arrays[3] = new college_student(1004,"小王","男",63,85,87);
        arrays[4] = new college_student(1005,"小李","女",82,89,97);


        Arrays.sort(arrays,(x,y)->{
            return (int) (x.total_score()-y.total_score());
        });


        System.out.println("总分最高为："+max(arrays));

        System.out.println("===========排序后=======");
        for (college_student b:arrays) {
            System.out.println(b);
        }
    }
    public static college_student max(college_student[] arrays){
        college_student a = arrays[0];
        for (college_student college_student:arrays) {
            float x = college_student.total_score();
            if (a.total_score()<x){
                a = college_student;
            }
        }
        return a;
    }
}
